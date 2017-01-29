package com.SvitlanaStarodub.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by user on 26.01.2017.
 */
public class CircleArea {
    public static final double PI=3.14d;
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for radius  ");
        double radius = scanner.nextDouble();

        double circleArea = Math.PI*radius*radius;
        System.out.println("Area is " + circleArea);
    }
    public static void calculateBigger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter radius1");
        double radius1 = scanner.nextDouble();
        double area1 = Math.PI*Math.pow(radius1,radius1);
        System.out.println ("Please enter radius2");
        double radius2 = scanner.nextDouble();
        double area2 = Math.PI*Math.pow(radius1,radius1);

        if (area1> area2)
            System.out.print("Area1 is bigger ");
            else
                System.out.println("Area2 is bigger ");
    }

public static void calculateCircle (double value) {
    System.out.println("Enter value for radius  ");


}
}
