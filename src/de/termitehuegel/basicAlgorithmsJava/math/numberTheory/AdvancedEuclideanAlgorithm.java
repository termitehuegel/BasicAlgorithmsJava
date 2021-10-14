package de.termitehuegel.basicAlgorithmsJava.math.numberTheory;

/**
 * @author termitehuegel
 */
public class AdvancedEuclideanAlgorithm {

    public int[] advancedEuclideanAlgorithm(int a, int b) {
        //if an input parameter has an illegal value
        if (a < 0 || b < 0) {
            //throw an exception: because the function of the method can't be performed
            throw new IllegalArgumentException("The given parameters a and b need to be positive or 0.");
        }
        //initialize result array
        int[] row = new int[5];
        //values for a and b are known
        row[0] = a;
        row[1] = b;
        //if b isn't 0 => isn't in the last row
        if (b!=0) {
            //calculate the next row
            int[] nextRow = advancedEuclideanAlgorithm(b, a%b);
            //the ggT is constant
            row[4] = nextRow[4];
            //this s is the t from the next row
            row[2] = nextRow[3];
            //this t is: s(nxt) - q*t(nxt)
            row[3] = nextRow[2] - a/b * nextRow[3];
        //last row
        } else {
            //s=1
            row[2] = 1;
            //t=1
            row[3] = 0;
            //ggT is 1 because a*1+0*0=ggT
            row[4] = a;
        }
        //returns the row
        return row;
    }

    public String rowTOString(int a, int b, int s, int t, int ggT) {
        return s+"*"+a+"+"+t+"*"+b+"="+ggT;
    }

    public String rowToString(int[] row) {
        if (row == null || row.length < 5) {
            throw new IllegalArgumentException("The given array needs to be non null and longer than 4.");
        }
        return rowTOString(row[0], row[1], row[2], row[3], row[4]);
    }
}
