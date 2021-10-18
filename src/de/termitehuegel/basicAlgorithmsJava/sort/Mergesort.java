package de.termitehuegel.basicAlgorithmsJava.sort;


/**
 * @author termitehuegel
 */
public class Mergesort{

    public <T extends Comparable<T>> void sort(T[] array) {
        //nullcheck, length-check
        if (array == null || array.length < 2) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //sorts the whole array
        sort(array, 0, array.length-1);
    }

    public <T extends Comparable<T>> void sort(T[] array, int begin, int end) {
        //nullcheck, length-check
        if (array == null || array.length < 2 || end-begin < 1) {
            //returns without sorting because null can be seen as sorted
            return;
        }

        //sort the left half of the array
        sort(array, begin, (end-begin)/2+begin);
        //sort the right half of the array
        sort(array, (end-begin)/2+begin+1, end);
        //merge both sides
        merge(array, begin, (end-begin)/2+begin, (end-begin)/2+begin+1, end);
    }

    public <T extends Comparable<T>> void merge(T[] array, int begin1, int end1, int begin2, int end2) {
        int start = begin1;
        //creates a temporary array which will store the merged result
        //an array of comparable is used because a direct instantiation of T isn't allowed
        Comparable<T>[] temp = new Comparable[end2-begin1+1];
        int i= 0;
        //while both sub-arrays aren't empty
        while (begin1 <= end1 && begin2 <= end2) {
            //if the first element of the first sub-array is smaller (or equal)
            if (array[begin1].compareTo(array[begin2]) <= 0) {
                //add it to the array
                temp[i] = array[begin1];
                begin1++;
            } else {
                //add the other element to the array
                temp[i] = array[begin2];
                begin2++;
            }
            i++;
        }
        //add the rest of the first sub-array to the array
        while (begin1 <= end1) {
            temp[i] = array[begin1];
            begin1++;
            i++;
        }
        //add the rest of the second sub-array to the array
        while (begin2 <= end2){
            temp[i] = array[begin2];
            begin2++;
            i++;
        }
        //replaces the sub-arrays with the temporary array
        System.arraycopy(temp, 0, array, start, temp.length);
    }

    public void sort(int[] array) {
        //nullcheck, length-check
        if (array == null || array.length < 2) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //sorts the whole array
        sort(array, 0, array.length-1);
    }

    public void sort(int[] array, int begin, int end) {
        //nullcheck, length-check
        if (array == null || array.length < 2 || end-begin < 1) {
            //returns without sorting because null can be seen as sorted
            return;
        }

        //sort the left half of the array
        sort(array, begin, (end-begin)/2+begin);
        //sort the right half of the array
        sort(array, (end-begin)/2+begin+1, end);
        //merge both sides
        merge(array, begin, (end-begin)/2+begin, (end-begin)/2+begin+1, end);
    }

    public void merge(int[] array, int begin1, int end1, int begin2, int end2) {
        int start = begin1;
        //creates a temporary array which will store the merged result
        int[] temp = new int[end2-begin1+1];
        int i= 0;
        //while both sub-arrays aren't empty
        while (begin1 <= end1 && begin2 <= end2) {
            //if the first element of the first sub-array is smaller (or equal)
            if (array[begin1] <= array[begin2]) {
                //add it to the array
                temp[i] = array[begin1];
                begin1++;
            } else {
                //add the other element to the array
                temp[i] = array[begin2];
                begin2++;
            }
            i++;
        }
        //add the rest of the first sub-array to the array
        while (begin1 <= end1) {
            temp[i] = array[begin1];
            begin1++;
            i++;
        }
        //add the rest of the second sub-array to the array
        while (begin2 <= end2){
            temp[i] = array[begin2];
            begin2++;
            i++;
        }
        //replaces the sub-arrays with the temporary array
        System.arraycopy(temp, 0, array, start, temp.length);
    }
}
