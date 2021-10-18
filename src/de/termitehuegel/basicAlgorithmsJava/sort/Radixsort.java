package de.termitehuegel.basicAlgorithmsJava.sort;


/**
 * @author termitehuegel
 */
public class Radixsort {

    public void sort(int[] array) {
        //Nullcheck
        if (array == null) {
            return;
        }
        //max value in the array
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        //sorts every digit from 0 until last
        Countingsort sort = new Countingsort();
        for (int exponent = 0; max / Math.pow(10, exponent) >= 1; exponent++) {
            sort.sortDigit(array, exponent);
        }
    }
}
