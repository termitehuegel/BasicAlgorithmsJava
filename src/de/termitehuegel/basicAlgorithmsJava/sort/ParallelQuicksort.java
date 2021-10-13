package de.termitehuegel.basicAlgorithmsJava.sort;

/**
 * @author termitehuegel
 */
public class ParallelQuicksort<T extends Comparable<T>> extends Thread{

    private final T[] array;
    private final int begin;
    private final int end;

    public ParallelQuicksort(T[] array) {
        this.array = array;
        begin = 0;
        //nullcheck
        if (array != null) {
            end = array.length-1;
        } else {
            end = -1;
        }
    }

    public ParallelQuicksort(T[] array, int begin, int end) {
        this.array = array;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        super.run();
        try {
            sort();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sort() throws InterruptedException {
        //finished if less than 2 Elements need to be sorted (-> 1 or 0) and nullcheck
        if (array != null && begin < end) {
            //get position of a pivot and sort the rest left if it's lower and right if it's bigger
            int pivotIndex = findPivot();

            //Sort everything lower than the last Pivot
            ParallelQuicksort<T> low = new ParallelQuicksort<>(array, begin, pivotIndex-1);
            low.start();
            //Sort everything bigger than the last Pivot
            ParallelQuicksort<T> high = new ParallelQuicksort<>(array, pivotIndex+1, end);
            high.start();
            //waits for completion
            low.join();
            high.join();
        }
    }

    private int findPivot() {
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
}
