package de.termitehuegel.basicAlgorithmsJava.array.search;

import org.jetbrains.annotations.NotNull;

/**
 * @author termitehuegel
 */
public class BinarySearch {

    public int search(@NotNull int[] array, int element) {
        return search(array, element, 0, array.length);
    }

    public int search(@NotNull int[] array, int element, int start, int end) {
        //mid of the interval that is to be sorted
        int mid = (end-start)/2 +start;
        //if the element is at the mid-index
        if (array[mid] == element) {
            return mid;
        }
        //if the element isn't in the array
        if (start == end) {
            return -1;
        }
        //if the element is left from mid
        if (array[mid] > element) {
            return search(array, element, start, mid);
        }
        //if the element is right from mid
        return search(array, element, mid, end);
    }
}
