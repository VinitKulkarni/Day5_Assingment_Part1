package com.bridgelabz.Day5P1;


//7. Java Program to Swap Two Numbers
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping: a="+a+" b="+b);

        int temp = a;
        a = b;
        b = a;

        System.out.println("After swapping: a="+a+" b="+b);
    }
}
