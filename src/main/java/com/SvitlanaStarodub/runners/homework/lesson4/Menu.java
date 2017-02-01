package com.SvitlanaStarodub.runners.homework.lesson4;

import com.SvitlanaStarodub.app.homework.lesson4.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 30.01.2017.
 */

    public class Menu {
    public static void main(String[] args) {
        int menuItem;
        do {
            System.out.println("Please choose the number to continue work with the programms.");
            System.out.println(" 1 : Right-angled triangles.");
            System.out.println(" 2 : Calculate circle area.");
            System.out.println(" 3 : Odd/Even Numbers");
            System.out.println(" 4: Quit");
            menuItem = intInput("");
            switch (menuItem) {
                case 1:
                    triangle();
                    break;
                case 2:
                    circle();
                    break;
                case 3:
                    numbersType();
                    break;
            }

        }
        while (menuItem != 4);
    }

    public static void circle() {
        String message1 = "Please enter radius1  ";
        String message2 = "Please enter radius2  ";
        double radius1 = doubleInput(message1);
        double radius2 = doubleInput(message2);

        int result = Calculator.circle(radius1, radius2);

        if (result == 1)
            System.out.println("Area1 is bigger ");
        else if (result == 2)
            System.out.println("Area2 is bigger ");
        else System.out.println("Areas are equal ");
    }

    public static void numbersType() {
        String message = "Please enter number.";
        int number = intInput(message);

        boolean result = Calculator.numbersType(number);

        if (result) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }

    public static void triangle() {
        String message1 = "Please enter first side ";
        String message2 = "Please enter second side ";
        String message3 = "Please enter third side ";

        double sideA = doubleInput(message1);
        double sideB = doubleInput(message2);
        double sideC = doubleInput(message3);
        boolean result = Calculator.triangle(sideA, sideB, sideC);

        if (result)
        {
            System.out.println("Congradulations! Your have right-angled triangle");
        }
        else{
            System.out.println("You have not right-angled triangle.");
        }
    }

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
