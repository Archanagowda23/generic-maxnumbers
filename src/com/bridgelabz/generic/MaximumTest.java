package com.bridgelabz.generic;

public class MaximumTest<T extends Comparable<T>> {

    //class variables
    T x, y, z;

    //parameterized construuctors for 3 variables
    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum()
    {
        return MaximumTest.maximum(x,y,z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;     //will assume x is maximum then compare with y and z
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }


    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);

    }
}