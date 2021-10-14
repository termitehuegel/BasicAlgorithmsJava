package de.termitehuegel.basicAlgorithmsJava.sort;

/**
 * @author termitehuegel
 */
public class Bubblesort implements SortingAlgorithm{

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //for every element
        for (int i=0; i<array.length; i++) {
            //for every element besides the already sorted
            for (int j=0; j<array.length-1-i; j++) {
                //if the element is larger than the following element
                if (array[j].compareTo(array[j+1]) > 0) {
                    //swap the element with the following element
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    @Override
    public void sort(int[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //for every element
        for (int i=0; i<array.length; i++) {
            //for every element besides the already sorted
            for (int j=0; j<array.length-1-i; j++) {
                //if the element is larger than the following element
                if (array[j] > array[j+1]) {
                    //swap the element with the following element
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
