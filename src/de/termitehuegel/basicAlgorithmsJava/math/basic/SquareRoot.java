package de.termitehuegel.basicAlgorithmsJava.math.basic;

/**
 * @author termitehuegel
 */
public class SquareRoot {

    public double squareRoot(final double radicant) {
        return root(radicant, 2);
    }

    public double root(final double radicant, final int exponent) {
        return root(radicant, exponent, radicant);
    }

    public double root(final double radicand, final int exponent, final double currentGuess) {
        if (radicand < 0) {
            return Double.NaN;
        }
        if (radicand == 0) {
            return 0;
        }
        final Power pow = new Power();
        //newton approximation for 0=x^ex-a => is true when x=a^(1/ex)
        final double newGuess = currentGuess - (pow.power(currentGuess, exponent)-radicand) / (exponent*pow.power(currentGuess, exponent-1));
        //if there has been large enough change => make another approximation
        if (currentGuess - newGuess >= Double.MIN_VALUE && radicand >1) {
            return root(radicand, exponent, newGuess);
        }
        //if there has been large enough change => make another approximation
        if (newGuess - currentGuess >= Double.MIN_VALUE && radicand < 1) {
            return root(radicand,exponent, newGuess);
        }

        //approximation is close enough
        return newGuess;
    }
}
