package de.termitehuegel.basicAlgorithmsJava.sort;


public class Heapsort{

    public <T extends Comparable<T>> void sort(T[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //heapifies the whole array
        //after array.length/2-1 only single leaves of the heap are left ==> leaves don't need to be heapified
        for (int i = array.length/2-1; i>=0; i--) {
            heapify(array, array.length, i);
        }

        //for each element in the array
        for (int i=array.length-1; i>=0; i--)  {
            //swaps the root (array[0]) with the last element of the heap (array[i])
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //the i-th element of the array is now sorted
            //=> the new length of the unsorted part of the array is i
            heapify(array, i, 0);
        }

    }
    private <T extends Comparable<T>> void heapify(T[] array, int length, int root) {
        //the largest element is supposed to be at the root
        int largest = root;
        //calculates the position of the left child
        int leftChild = 2*root + 1;
        //calculates the position of the right child
        int rightChild = 2*root + 2;

        //if the left child is defined, and it's bigger than the current root
        if (leftChild < length && array[leftChild].compareTo(array[largest]) > 0) {
            //it shall be the new largest element and thereby the new root
            largest = leftChild;
        }

        //if the left child is defined, and it's bigger than the current root
        if (rightChild < length && array[rightChild].compareTo(array[largest]) > 0) {
            //it shall be the new largest element and thereby the new root
            largest = rightChild;
        }

        //if the current root isn't the largest element
        if (largest != root) {
            //swap the root with the largest element
            T temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;
            //the root of a subtree has changed => heapify this subtree
            heapify(array, length, largest);
        }
    }

    public void sort(int[] array) {
        //nullcheck
        if (array == null) {
            //returns without sorting because null can be seen as sorted
            return;
        }
        //heapifies the whole array
        //after array.length/2-1 only single leaves of the heap are left ==> leaves don't need to be heapified
        for (int i = array.length/2-1; i>=0; i--) {
            heapify(array, array.length, i);
        }

        //for each element in the array
        for (int i=array.length-1; i>=0; i--)  {
            //swaps the root (array[0]) with the last element of the heap (array[i])
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //the i-th element of the array is now sorted
            //=> the new length of the unsorted part of the array is i
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int length, int root) {
        //the largest element is supposed to be at the root
        int largest = root;
        //calculates the position of the left child
        int leftChild = 2*root + 1;
        //calculates the position of the right child
        int rightChild = 2*root + 2;

        //if the left child is defined, and it's bigger than the current root
        if (leftChild < length && array[leftChild] > array[largest]) {
            //it shall be the new largest element and thereby the new root
            largest = leftChild;
        }

        //if the left child is defined, and it's bigger than the current root
        if (rightChild < length && array[rightChild] > array[largest]) {
            //it shall be the new largest element and thereby the new root
            largest = rightChild;
        }

        //if the current root isn't the largest element
        if (largest != root) {
            //swap the root with the largest element
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;
            //the root of a subtree has changed => heapify this subtree
            heapify(array, length, largest);
        }
    }
}
