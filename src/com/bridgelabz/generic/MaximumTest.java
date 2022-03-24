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

    }
