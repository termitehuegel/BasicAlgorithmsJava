package de.termitehuegel.basicAlgorithmsJava.array.sort;

/**
 * @author termitehuegel
 */
public class Swapsort{
    public <T extends Comparable<T>> void sort(T[] array) {
        //nullcheck
        if (array == null) {
            //null can be seen as sorted
            return;
        }
        //for every element
        for (int i=0; i<array.length; i++) {
            int lowerElements = 0;
            //count the lower elements
            for (int j=0; j<array.length; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    lowerElements++;
                    //if there is a duplicate
                } else if (j!=i && array[j] == array[i]) {
                    //swap sort will end up in an infinite loop when the array contains duplicates
                    throw new IllegalArgumentException("The array can't contain duplicates.");
                }
            }
            //swap the with the "amount of lower elements + 1"'th-element
            //if the element is in the right place already => move to the next element
            if (i != lowerElements) {
                T temp = array[i];
                array[i] = array[lowerElements];
                array[lowerElements] = temp;
                i--;
            }
        }
    }

    public void sort(int[] array) {
        //nullcheck
        if (array == null) {
            //null can be seen as sorted
            return;
        }
        //for every element
        for (int i=0; i<array.length; i++) {
            int lowerElements = 0;
            //count the lower elements
            for (int j=0; j<array.length; j++) {
                if (array[j] < array[i]) {
                    lowerElements++;
                //if there is a duplicate
                } else if (j!=i && array[j] == array[i]) {
                    //swap sort will end up in an infinite loop when the array contains duplicates
                    throw new IllegalArgumentException("The array can't contain duplicates.");
                }
            }
            //swap the with the "amount of lower elements + 1"'th-element
            //if the element is in the right place already => move to the next element
            if (i != lowerElements) {
                int temp = array[i];
                array[i] = array[lowerElements];
                array[lowerElements] = temp;
                i--;
            }
        }
    }
}
