package de.termitehuegel.basicAlgorithmsJava.array.search;

import org.jetbrains.annotations.NotNull;

/**
 * @author termitehuegel
 */
public class SequentialSearch {

    public <T> int search(@NotNull T[] array, @NotNull T element) {
        //for every element in the array
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(element)) {
                //return index
                return i;
            }
        }
        //element isn't in the array
        return -1;
    }

    public int search(@NotNull int[] array, int element) {
        //for every element in the array
        for (int i=0; i<array.length; i++) {
            if (array[i] == element) {
                //return index
                return i;
            }
        }
        //element isn't in the array
        return -1;
    }
}
