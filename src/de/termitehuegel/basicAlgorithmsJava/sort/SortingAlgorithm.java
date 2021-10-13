package de.termitehuegel.basicAlgorithmsJava.sort;

/**
 * @author termitehuegel
 */
public interface SortingAlgorithm {

    //sorts every comparable object array
    <T extends Comparable<T>> void sort(T[] array);

    //sorts primitive int arrays
    void sort(int[] array);

}
