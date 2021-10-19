package de.termitehuegel.basicAlgorithmsJava.math.basic;

/**
 * @author termitehuegel
 */
public class SquareRoot {

    public double squareRoot(double a, double currentGuess) {
        if (a < 0) {
            return Double.NaN;
        }
        //sqrt(0) = 0
        if (a == 0) {
            return 0;
        }
        //newton approximation for 0=x^2-a => is true when x=sqrt(a)
        double newGuess = currentGuess - (currentGuess*currentGuess-a) / (2*currentGuess);
        //if there has been large enough change => make another approximation
        if (currentGuess - newGuess >= Double.MIN_VALUE && a >1) {
            return squareRoot(a, newGuess);
        }
        if (newGuess - currentGuess >= Double.MIN_VALUE && a < 1) {
            return squareRoot(a, newGuess);
        }

        //approximation is close enough
        return newGuess;
    }

    public double squareRoot(double a) {
        return squareRoot(a, a);
    }

}
