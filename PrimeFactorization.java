package com.bridgelabz.Day5P1;

import java.util.Scanner;

//5.prime factorization
public class PrimeFactorization {
    public static int isPrime(int n){
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }

    public static void primeFactors(int n)
    {
        for(int i = 2; i<= n; i++){
            if(isPrime(i)==1){
                int x = n;
                while(x%i==0){
                    System.out.print(i + " ");
                    x = x/i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        primeFactors(n);
    }
}
