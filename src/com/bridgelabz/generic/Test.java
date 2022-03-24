package com.bridgelabz.generic;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Welcome to generic max-numbers program");

        String xStr = "zmelon", yStr = "apple", zStr = "grape";
        Integer xInt = 600, yInt = 50, zInt = 800;
        Float xfloat = 100.6f, yfloat = 50.6f, zfloat = 70.9f;

        MaximumTest.testMaximum(xStr,yStr,zStr);
        new MaximumTest(xfloat, yfloat, zfloat).maximum();
        new MaximumTest(xInt, yInt, zInt).maximum();
        new MaximumTest(xStr, yStr, zStr).maximum();

    }
}
