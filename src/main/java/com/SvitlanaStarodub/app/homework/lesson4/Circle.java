package com.SvitlanaStarodub.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by user on 29.01.2017.
 */
public class Circle {
    public static void circle() {

        String message1= "Please enter radius1  ";
        String message2= "Please enter radius2  ";
        double radius1 = Inputs.doubleInput(message1);
        double radius2 = Inputs.doubleInput(message2);


        double circleArea1 = Math.PI * radius1 * radius1;
        double circleArea2 = Math.PI * radius2 * radius2;

        if (circleArea1 > circleArea2)
            System.out.println("Area1 is bigger ");
        else if (circleArea1 < circleArea2)
            System.out.println("Area2 is bigger ");
        else System.out.println("Areas are equal ");
    }
}