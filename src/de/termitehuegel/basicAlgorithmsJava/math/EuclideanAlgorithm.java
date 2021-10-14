package de.termitehuegel.basicAlgorithmsJava.math;

/**
 * @author termitehuegel
 */
public class EuclideanAlgorithm {

    public int euclideanAlgorithm(int a, int b) throws IllegalArgumentException{
        //if an input parameter has an illegal value
        if (a < 0 ||b < 0) {
            //throw an exception: because the function of the method can't be performed
            throw new IllegalArgumentException("The given parameters a and b need to be positive or 0.");
        }
        //if b is 0 return a
        if (b == 0) {
            return a;
        }
        //else: recursively call the euclidean algorithm with b as the new a and a%b as the new b
        return euclideanAlgorithm(b, a%b);
    }
}
