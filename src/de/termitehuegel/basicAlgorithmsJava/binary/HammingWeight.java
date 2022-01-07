package de.termitehuegel.basicAlgorithmsJava.binary;

public class HammingWeight {

    //returns the number of set bits in the integer representing a 32-bit integer
    public int getHammingWeight(int x) {
        if (x==0) {
            return 0;
        }
        return (x&1) + getHammingWeight(x>>>1);
    }

    public long getHammingWeight(long x) {
        if (x==0) {
            return 0;
        }
        return (x&1) + getHammingWeight(x>>>1);
    }

    public int getHammingWeight(byte[] bytes) {
        int bits = 0;
        for (byte b : bytes) {
            bits += getHammingWeight(b);
        }
        return bits;
    }

    //returns the hammingDistance of x and y
    public int getHammingDistance(int x, int y) {
        x = x^y;
        return  getHammingWeight(x);
    }

    public long getHammingDistance(long x, long y) {
        x = x^y;
        return  getHammingWeight(x);
    }
}
