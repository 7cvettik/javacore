package com.SvitlanaStarodub.app.homework.lesson4;

/**
 * Created by user on 12.02.2017.
 */
public class Submenu {
    public static void circleSubmenu() {
        String message1 = "Please enter radius1  ";
        String message2 = "Please enter radius2  ";
        double radius1 = Input.doubleInput(message1);
        double radius2 = Input.doubleInput(message2);

        int result = Calculator.circleCalculator(radius1, radius2);

        if (result == 1)
            System.out.println("Area1 is bigger ");
        else if (result == 2)
            System.out.println("Area2 is bigger ");
        else System.out.println("Areas are equal ");
    }

    public static void numbersTypeSubmenu() {
        String message = "Please enter number.";
        int number = Input.intInput(message);

        boolean result = Calculator.numbersTypeCalculator(number);

        if (result) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }

    public static void triangleSubmenu() {
        String message1 = "Please enter first side ";
        String message2 = "Please enter second side ";
        String message3 = "Please enter third side ";

        double sideA = Input.doubleInput(message1);
        double sideB = Input.doubleInput(message2);
        double sideC = Input.doubleInput(message3);
        boolean result = Calculator.triangleCalculator(sideA, sideB, sideC);

        if (result)
        {
            System.out.println("Congradulations! Your have right-angled triangle");
        }
        else{
            System.out.println("You have not right-angled triangle.");
        }
    }
}
