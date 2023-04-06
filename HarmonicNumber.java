package com.bridgelabz.Day5P1;

import java.util.Scanner;

//4.Harmonic Number
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number:");
        int N = sc.nextInt();

        float sum = 0;
        while(N != 0){
            System.out.println("1/"+N);
            sum = sum + (float)(1.0/N);
            N--;
        }
        System.out.println("Result = " + sum);
    }
}
