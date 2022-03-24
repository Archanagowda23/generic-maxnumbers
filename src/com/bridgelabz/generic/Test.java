package com.bridgelabz.generic;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Welcome to generic max-numbers program");

        String xStr = "zmelon", yStr = "apple", zStr = "grape";
        Integer xInt = 600, yInt = 50, zInt = 800;

        MaximumTest.testMaximum(xStr,yStr,zStr);
        MaximumTest.testMaximum(xInt,yInt,zInt);
    }
}
