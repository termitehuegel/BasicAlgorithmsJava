package de.termitehuegel.basicAlgorithmsJava.array.sort;


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

    public void sortDigit(int[] array, int exponent) {
        //Nullcheck
        if (array == null) {
            return;
        }
        //temporary array => will store the count of every element
        int[] temp = new int[10];
        int[] result = new int[array.length];
        //counts digits
        for (int number : array) {
            //count digit
            temp[(int) (number/Math.pow(10,exponent) % 10)]++;
        }
        //accumulation phase => temp[i] now holds the last index for a digit
        for (int i = 1; i < 10; i++) {
            temp[i] += temp[i - 1];
        }

        //for every element starting from behind
        for (int i = array.length - 1; i >= 0; i--) {
            //set the result for the corresponding element
            result[temp[(int) ((array[i] / Math.pow(10,exponent)) % 10)] - 1] = array[i];
            //digit count for this digit is reduced
            temp[(int) ((array[i] / Math.pow(10,exponent)) % 10)]--;
        }

        //replace the input array with the result
        System.arraycopy(result, 0, array, 0, array.length);
    }
}
