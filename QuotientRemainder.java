package com.bridgelabz.Day5P1;


import java.util.Scanner;

//6.Compute Quotient and Remainder
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend number:");
        int data = sc.nextInt();
        int divisor = 2;

        System.out.println("divisor = " +divisor);
        System.out.println("dividend = " +data);

        System.out.println("----------------");

        int remainder = (data%divisor);
        System.out.println("Reminder = " + remainder);

        int quotient = (data/divisor);
        System.out.println("Quotient = " + quotient);
    }
}
