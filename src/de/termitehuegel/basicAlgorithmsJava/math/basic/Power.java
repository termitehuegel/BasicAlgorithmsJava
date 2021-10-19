package de.termitehuegel.basicAlgorithmsJava.math.basic;

/**
 * @author termitehuegel
 */
public class Power {

    public double power(final double basis, final int exponent) {
        //0^0 and 0^-a isn't defined
        if (basis==0 && exponent <= 0) {
            return Double.NaN;
        }

        double result = 1;
        //positiv exponents
        for (int i=0; i<exponent; i++) {
            result *= basis;
        }
        //negativ exponents
        for (int i=0; i>exponent; i--) {
            result /= basis;
        }

        return result;
    }

}
