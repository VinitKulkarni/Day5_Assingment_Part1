package com.bridgelabz.Day5P1;
//9. Java Program to Check Whether an Alphabet is Vowel or Consonant
public class VowelConsonant {
    public static void main(String[] args) {
        char value = 'z';

        if(value=='a' || value=='e' || value=='i' || value=='o' || value=='u'){
            System.out.println(value + " is Vowel");
        }else{
            System.out.println(value + " is Consonant");
        }
    }
}
