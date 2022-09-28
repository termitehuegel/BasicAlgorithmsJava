package de.termitehuegel.basicAlgorithmsJava.math.basic;

/**
 * @author termitehuegel
 */
public class Power {

    public double power(final double base, final int exponent) {
        //0^0 and 0^-a isn't defined
        if (base==0 && exponent <= 0) {
            return Double.NaN;
        }

        double result = 1;
        //positiv exponents
        for (int i=0; i<exponent; i++) {
            result *= base;
        }
        //negativ exponents
        for (int i=0; i>exponent; i--) {
            result /= base;
        }

        return result;
    }

    public double squareMultiply(final double base, final int exponent, final int modulus) {
        if (modulus <= 0) {
            throw new IllegalArgumentException("Only supports positive modulus.");
        }
        if (exponent < 0) {
            return 1/squareMultiply(base, -exponent);
        }
        double result = 1;
        final String binaryExponent= Integer.toBinaryString(exponent);
        for (char c : binaryExponent.toCharArray()) {
            result *= result;
            result %= modulus;
            if (c == '1') {
                result *= base;
                result %= modulus;
            }
        }
        return result;
    }

    public double squareMultiply(final double base, final int exponent) {
        if (exponent < 0) {
            return 1/squareMultiply(base, -exponent);
        }
        double result = 1;
        final String binaryExponent= Integer.toBinaryString(exponent);
        for (char c : binaryExponent.toCharArray()) {
            result *= result;
            if (c == '1') {
                result *= base;
            }
        }
        return result;
    }

}
