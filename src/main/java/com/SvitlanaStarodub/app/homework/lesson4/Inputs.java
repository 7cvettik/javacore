package com.SvitlanaStarodub.app.homework.lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 29.01.2017.
 */
public class Inputs {

    public static double doubleInput(String message)
    {
        double value =0;
        boolean result =false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(message);
                value = scanner.nextDouble();
                if (value > 0) result = true;
                else System.out.println("Enter number more than 0");
            } catch (InputMismatchException e) {
                System.out.println("Enter number more than 0");
            }
        }
        while (result==false) ;
        return value;

    }

    public static int intInput(String message){
        int value =0;
boolean result = false;
do {
    try {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        value = scanner.nextInt();
        if (value !=0) result = true;
        else System.out.println("Enter number except 0");

    } catch (InputMismatchException e) {
        System.out.println("Enter correct INT number");
    }
}
while (result == false);
        return value;
    }

}
