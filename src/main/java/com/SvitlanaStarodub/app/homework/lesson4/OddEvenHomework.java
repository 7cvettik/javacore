package com.SvitlanaStarodub.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by user on 29.01.2017.
 */
public class OddEvenHomework {
    public static void numbersType () {

        String message ="Please enter number.";
        int number = Inputs.intInput(message);

        if (number%2 == 0 ){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    }
}
