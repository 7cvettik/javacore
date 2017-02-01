package com.SvitlanaStarodub.runners.homework.lesson5;

import com.SvitlanaStarodub.app.homework.lesson5.Mountains;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 01.02.2017.
 */
public class DataDrivenMountains {
    public static void main(String[] args) {


        String message = "Please enter mountain's high  ";
        int value=0;

        boolean result = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(message);
                value = scanner.nextInt();
                if (value > 0) result = true;
                else System.out.println("Enter number more than 0");
            } catch (InputMismatchException e) {
                System.out.println("Enter number more than 0");
            }
        }
        while (result == false);
        String answer = Mountains.highMountains(value);
        System.out.println(answer);

    }

}
