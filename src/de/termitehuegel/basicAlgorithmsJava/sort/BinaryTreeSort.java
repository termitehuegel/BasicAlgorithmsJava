package de.termitehuegel.basicAlgorithmsJava.sort;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeSort {

    private static class Node<T> {
        private final T value;
        private Node<T> left;
        private Node<T> right;
        Node(T value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    private  <T extends Comparable<T>> Node<T> insert(Node<T> node, T value){
        //if node is null than create a new one
        if(node == null){
            return new Node<T>(value);
        }

        //smaller nodes are left children
        if(value.compareTo(node.value) < 0){
            node.left = insert(node.left, value);
        }
        //greater or equal nodes are right children
        else if(value.compareTo(node.value) >= 0){
            node.right = insert(node.right, value);
        }
        return node;
    }

    private  <T extends Comparable<T>> void inOrder(Node<T> node, List<T> result){
        //if a node exists
        if(node != null){
            //all left child nodes are smaller
            inOrder(node.left, result);
            //then the node itself
            result.add(node.value);
            //all right child nodes are larger
            inOrder(node.right, result);
        }
    }

    public <T extends Comparable<T>> void sort(T[] array) {
        //Nullcheck
        if (array == null) {
            return;
        }
        //list to save the result
        List<T> result = new ArrayList<>();
        //start node
        Node<T> node = new Node<T>(array[0]);
        //insert every element in the corresponding node
        for(T element : array){
            insert(node, element);
        }
        //order the nodes => result is saved in result
        inOrder(node, result);
        //converts the result list to array
        for (int i=0; i<array.length; i++) {
            array[i] = result.get(i);
        }
    }

    public void sort(int[] array) {
        //Nullcheck
        if (array == null) {
            return;
        }
        //converts the primitive int array to an Integer array
        Integer[] tempArray = new Integer[array.length];
        for (int i=0; i<array.length; i++) {
            tempArray[i] = array[i];
        }
        //sorts the Integer array
        sort(tempArray);
        //converts back
        for (int i=0; i<array.length; i++) {
            array[i] = tempArray[i];
        }
    }
}
