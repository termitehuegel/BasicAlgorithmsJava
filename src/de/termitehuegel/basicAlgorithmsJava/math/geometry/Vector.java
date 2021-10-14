package de.termitehuegel.basicAlgorithmsJava.math.geometry;

import java.util.Arrays;

/**
 * @author termitehuegel
 */
public class Vector {

    //the coordinates of the vector
    //coordinates[i] represents the coordinate x_i+1
    private final double[] coordinates;

    public Vector(double[] coordinates) {
        //nullcheck
        if (coordinates == null) {
            //a vector needs coordinates
            throw new IllegalArgumentException("Coordinates can't be null.");
        }
        //length-check
        if (coordinates.length < 1) {
            //a vector needs coordinates
            throw new IllegalArgumentException("A vector need at least 1 dimension.");
        }
        this.coordinates = coordinates;
    }

    public void addVector(Vector vector) {
        //nullcheck
        if (vector == null) {
            //can't add null to a vector
            throw new IllegalArgumentException("Vector can't be null.");
        }
        //length-check
        if (vector.coordinates.length != coordinates.length) {
            //vectors that are added to each other need the same number of dimensions
            throw new IllegalArgumentException("The vectors need to have the same number of dimensions.");
        }
        //adds the vectors
        for (int i=0; i<coordinates.length; i++) {
            coordinates[i] += vector.coordinates[i];
        }
    }

    public void scalarMultiplication(double a) {
        //multiplies every coordinate by a
        for (int i=0; i<coordinates.length; i++) {
            coordinates[i] *= a;
        }
    }

    public double magnitude() {
        double result = 0;
        //calculates the magnitude |a| = sqrt(a1^2 + a2^2 + ... + an^2)
        for (int i=0; i<coordinates.length; i++) {
            result += Math.pow(coordinates[i], 2);
        }
        return Math.sqrt(result);
    }

    public double scalarProduct(Vector vector) {
        //nullcheck
        if (vector == null) {
            //can't multiply a vector with null
            throw new IllegalArgumentException("Vector can't be null.");
        }
        //length-check
        if (vector.coordinates.length != coordinates.length) {
            //can't multiply vectors with a different number of dimensions
            throw new IllegalArgumentException("The vectors need to have the same number of dimensions.");
        }
        //calculates the scalar product
        double result = 0;
        for (int i=0; i<coordinates.length; i++) {
            result += coordinates[i]* vector.coordinates[i];
        }
        return result;
    }

    public boolean isOrthogonal(Vector vector) {
        //a and b are orthogonal if their scalar product is 0
        return 0 == scalarProduct(vector);
    }

    public boolean isCollinear(Vector vector) {
        //nullcheck
        if (vector == null) {
            //can't decide if null is collinear to any vector
            throw new IllegalArgumentException("Vector can't be null.");
        }
        //length-check
        if (vector.coordinates.length != coordinates.length) {
            //can't compare vectors with different dimensions
            throw new IllegalArgumentException("The vectors need to have the same number of dimensions.");
        }
        //a and b are collinear if k*a=b or a_i/b_i = k => k is constant
        double k = coordinates[0]/vector.coordinates[0];
        for (int i=1; i<coordinates.length; i++) {
            //if k isn't constant => vectors aren't collinear
            if (k != coordinates[i]/vector.coordinates[i]) {
                return false;
            }
        }
        return true;
    }

    public double angle(Vector vector) {
        //nullcheck
        if (vector == null) {
            //can't decide if null is collinear to any vector
            throw new IllegalArgumentException("Vector can't be null.");
        }
        //length-check
        if (vector.coordinates.length != coordinates.length) {
            //can't compare vectors with different dimensions
            throw new IllegalArgumentException("The vectors need to have the same number of dimensions.");
        }
        //cos(alpha) = (a*b) / (|a|*|b|)
        return Math.acos(scalarProduct(vector)/(magnitude()*vector.magnitude()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        return Arrays.equals(coordinates, vector.coordinates);
    }


    @Override
    public String toString() {
        return "Vector{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
