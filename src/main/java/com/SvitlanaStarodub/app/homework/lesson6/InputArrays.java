package com.SvitlanaStarodub.app.homework.lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 12.02.2017.
 */
public class InputArrays {
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
