package de.termitehuegel.basicAlgorithmsJava.array.sort;

/**
 * @author termitehuegel
 */
public class Quicksort {

    public <T extends Comparable<T>> void sort(T[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        sort(array, 0, array.length-1);
    }

    public <T extends Comparable<T>> void sort(T[] array, int begin, int end) {
        //finished if less than 2 Elements need to be sorted (-> 1 or 0)
        if (begin < end) {
            //get position of a pivot and sort the rest left if it's lower and right if it's bigger
            int pivotIndex = findPivot(array, begin, end);

            //Sort everything lower than the last Pivot
            sort(array, begin, pivotIndex-1);
            //Sort everything bigger than the last Pivot
            sort(array, pivotIndex+1, end);
        }
    }

    private <T extends Comparable<T>> int findPivot(T[] array, int begin, int end) {
        //The last element shall be the pivot
        T pivot = array[end];
        //the item lastLowerThanPivot is on the first Element -1
        int lastLowerThanPivot = (begin - 1);
        //compare all elements to the pivot
        for (int counter = begin; counter < end; counter++) {
            //if element<=pivot
            if (array[counter].compareTo(pivot) <= 0) {
                lastLowerThanPivot++;
                //Swap The element on counter with the element on lastLowerThanPivot
                T temp = array[counter];
                array[counter] = array[lastLowerThanPivot];
                array[lastLowerThanPivot] = temp;
            }
        }
        //swap the pivot (last Item) with the item after the lastLowerThanPivot Element
        T temp = array[end];
        array[end] = array[lastLowerThanPivot+1];
        array[lastLowerThanPivot+1] = temp;
        //return the index of the Pivot
        return lastLowerThanPivot+1;
    }


    public void sort(int[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        sort(array, 0, array.length-1);
    }


    public void sort(int[] array, int begin, int end) {
        //finished if less than 2 Elements need to be sorted (-> 1 or 0)
        if (begin < end) {
            //get position of a pivot and sort the rest left if it's lower and right if it's bigger
            int pivotIndex = findPivot(array, begin, end);

            //Sort everything lower than the last Pivot
            sort(array, begin, pivotIndex-1);
            //Sort everything bigger than the last Pivot
            sort(array, pivotIndex+1, end);
        }
    }

    private int findPivot(int[] array, int begin, int end) {
        //The last element shall be the pivot
        int pivot = array[end];
        //the item lastLowerThanPivot is on the first Element -1
        int lastLowerThanPivot = (begin - 1);
        //compare all elements to the pivot
        for (int counter = begin; counter < end; counter++) {
            //if element<=pivot
            if (array[counter] <= pivot) {
                lastLowerThanPivot++;
                //Swap The element on counter with the element on lastLowerThanPivot
                int temp = array[counter];
                array[counter] = array[lastLowerThanPivot];
                array[lastLowerThanPivot] = temp;
            }
        }
        //swap the pivot (last Item) with the item after the lastLowerThanPivot Element
        int temp = array[end];
        array[end] = array[lastLowerThanPivot+1];
        array[lastLowerThanPivot+1] = temp;
        //return the index of the Pivot
        return lastLowerThanPivot+1;
    }
}
