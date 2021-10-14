package de.termitehuegel.basicAlgorithmsJava.math.geometry;

/**
 * @author termitehuegel
 */
public class Vector {

    private final int dimensions;
    private final double[] coordinates;

    public Vector(int dimensions, double[] coordinates) {
        if (dimensions <= 0) {
            throw new IllegalArgumentException("A vector need at least 1 dimension.");
        }
        if (coordinates.length != dimensions) {
            throw new IllegalArgumentException("A vector needs as many coordinates as it has dimensions");
        }
        this.dimensions = dimensions;
        this.coordinates = coordinates;
    }

    public Vector(double[] coordinates) {
        this(coordinates.length, coordinates);
    }

    public void addVector(Vector vector) {
        if (vector == null) {
            throw new IllegalArgumentException("Vector can't be null.");
        }
        if (vector.dimensions != dimensions) {
            throw new IllegalArgumentException("The vectors need to have the same number of dimensions.");
        }
        for (int i=0; i<dimensions; i++) {
            coordinates[i] += vector.coordinates[i];
        }
    }

    public void scalarMultiplication(double a) {
        for (int i=0; i<dimensions; i++) {
            coordinates[i] *= a;
        }
    }

    public double magnitude() {
        double result = 0;
        for (int i=0; i<dimensions; i++) {
            result += Math.pow(coordinates[i], 2);
        }
        return Math.sqrt(result);
    }

    public double scalarProduct(Vector vector) {
        if (vector == null) {
            throw new IllegalArgumentException("Vector can't be null.");
        }
        if (vector.dimensions != dimensions) {
            throw new IllegalArgumentException("The vectors need to have the same number of dimensions.");
        }
        double result = 0;
        for (int i=0; i<dimensions; i++) {
            result += coordinates[i]* vector.coordinates[i];
        }
        return result;
    }
    public boolean isOrthogonal(Vector vector) {
        return 0 == scalarProduct(vector);
    }

    public boolean isCollinear(Vector vector) {
        if (vector == null) {
            throw new IllegalArgumentException("Vector can't be null.");
        }
        if (vector.dimensions != dimensions) {
            throw new IllegalArgumentException("The vectors need to have the same number of dimensions.");
        }
        double r = coordinates[0]/vector.coordinates[0];
        for (int i=1; i<dimensions; i++) {
            if (r != coordinates[i]/vector.coordinates[i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i=0; i<dimensions; i++) {
            s.append("x").append(i).append("=").append(coordinates[i]).append("; ");
        }
        return s.toString();
    }
}
