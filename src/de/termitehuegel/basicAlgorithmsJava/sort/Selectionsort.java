package de.termitehuegel.basicAlgorithmsJava.sort;

/**
 * @author termitehuegel
 */
public class Selectionsort{

    public <T extends Comparable<T>> void sort(T[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //for half of all elements
        for (int i=0; i<array.length-1-i; i++) {
            int min = i;
            int max = i;
            //find the maximum and minimum value in the unsorted part
            for (int j=i+1; j<array.length-i; j++) {
                if (array[min].compareTo(array[j]) > 0) {
                    min = j;
                } else if (array[max].compareTo(array[j]) < 0) {
                    max = j;
                }
            }
            if (i == max) {
                max = min;
            }
            //swap the smallest element with the i-th element
            //the smallest element is now part of the sorted part
            T temp = array[min];
            array[min] = array[i];
            array[i] = temp;

            //swap the largest element with the i-th element form the end
            //the largest element is now part of the sorted part
            temp = array[max];
            array[max] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    public void sort(int[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //for half of all elements
        for (int i=0; i<array.length-1-i; i++) {
            int min = i;
            int max = i;
            //find the maximum and minimum value in the unsorted part
            for (int j=i+1; j<array.length-i; j++) {
                if (array[min] > array[j]) {
                    min = j;
                } else if (array[max] < array[j]) {
                    max = j;
                }
            }

            if (i == max) {
                max = min;
            }
            //swap the smallest element with the i-th element
            //the smallest element is now part of the sorted part
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            //swap the largest element with the i-th element form the end
            //the largest element is now part of the sorted part
            temp = array[max];
            array[max] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}

