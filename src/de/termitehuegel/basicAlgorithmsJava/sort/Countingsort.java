package de.termitehuegel.basicAlgorithmsJava.sort;


/**
 * @author termitehuegel
 */
public class Countingsort{

    public void sort(int[] array, int lowerBound, int upperBound) {
        //Nullcheck
        if (array == null) {
            return;
        }
        //Check if interval contains numbers
        if (lowerBound>=upperBound) {
            throw new IllegalArgumentException("lowerBound must be smaller than upperBound.");
        }
        //temporary array => will store the count of every element
        int[] temp = new int[upperBound-lowerBound];
        //counts elements
        for (int number : array) {
            //if element isn't in the interval => Exception
            if (number<lowerBound || number >= upperBound) {
                throw new IllegalArgumentException(number + " is out if bounds.");
            }
            //count index = number-lowerBound
            temp[number-lowerBound]++;
        }
        //write the counted elements into the array
        int j=0;
        for (int i=0; i<temp.length; i++) {
            for (int k=0; k<temp[i]; k++) {
                //the number = index+lowerBound
                array[j] = i+lowerBound;
                j++;
            }
        }
    }
}
