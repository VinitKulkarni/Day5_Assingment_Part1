package com.bridgelabz.Day5P1;

import java.util.Scanner;

//1.Flip Coin and print percentage of Heads and Tails
public class PercentageExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to flip the coin:");
        int N = sc.nextInt();

        int headCount = 0;
        int tailCount = 0;

        for(int i=0; i<N; i++){
            float coinValue = (float)(Math.random()*10%1);
            System.out.println(coinValue);
            if(coinValue < 0.5){
                tailCount++;
            }else{
                headCount++;
            }
        }

        System.out.println("head count = " +headCount);
        System.out.println("tail count = " +tailCount);


        float headPercentage = (headCount/(float)N);
        float tailPercentage = (tailCount/(float)N);


        System.out.println("Percentage of Head & Tail is:");
        System.out.println("Heads:"+headPercentage+" vs "+"Tails:"+tailPercentage);
    }
}
