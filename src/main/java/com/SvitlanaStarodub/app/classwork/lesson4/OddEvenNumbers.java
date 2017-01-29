package com.SvitlanaStarodub.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by user on 26.01.2017.
 */
public class OddEvenNumbers {
    public static void numbersType (String [] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter number.");
     int number = (int) scanner.nextDouble();
     double number1 = number/2;
     int number2 =(int)number1;

     if (number2+number2 == number ){
       System.out.println("Number is even.");
     }
else{
         System.out.println("Number is odd.");
     }
    }
}
