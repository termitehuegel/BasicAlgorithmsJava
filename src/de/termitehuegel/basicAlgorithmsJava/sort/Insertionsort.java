package de.termitehuegel.basicAlgorithmsJava.sort;

/**
 * @author termitehuegel
 */
public class Insertionsort{

    public <T extends Comparable<T>> void sort(T[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //for every element besides the first
        for (int i=1; i<array.length; i++) {
            //temporarily store its value
            T val = array[i];
            int j=i;
            //while the element on the left is larger
            while (j>0 && array[j - 1].compareTo(val) > 0) {
                //shift it right
                array[j] = array[j-1];
                j--;
            }
            //insert the element when larger elements in the sorted part are right
            //and smaller elements are left
            array[j] = val;
        }
    }

    public void sort(int[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //for every element besides the first
        for (int i=1; i<array.length; i++) {
            //temporarily store its value
            int val = array[i];
            int j=i;
            //while the element on the left is larger
            while (j>0 && array[j - 1] > val) {
                //shift it right
                array[j] = array[j-1];
                j--;
            }
            //insert the element when larger elements in the sorted part are right
            //and smaller elements are left
            array[j] = val;
        }
    }
}
