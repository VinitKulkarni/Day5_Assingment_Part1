package com.bridgelabz.Day5P1;

import java.util.Scanner;

//2.Leap Year
public class LeapYear {
    public static void main(String[] args) {
        //leap years examples: 2012, 2048
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = sc.nextInt();
        boolean flag = false;

        if(year%4 == 0)
        {
            if(year%10 == 0)
            {
                if(year%400 == 0) {
                    flag = true;
                }else{
                    flag = false;
                }
            }else{
                flag = true;
            }
        }else{
            flag = false;
        }


        if(flag == false){
            System.out.println(year + " Not leap year");
        }else{
            System.out.println(year + " is leap year");
        }
    }
}
