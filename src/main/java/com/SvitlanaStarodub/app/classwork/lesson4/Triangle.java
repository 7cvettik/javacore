package com.SvitlanaStarodub.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by user on 26.01.2017.
 */
public class Triangle {
    public static void triangle (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first side ");
        double sideA = scanner.nextDouble();
        System.out.println("Please enter second side ");
        double sideB = scanner.nextDouble();
        System.out.println("Please enter third side ");
        double sideC = scanner.nextDouble();
        if ((sideC*sideC==sideB*sideB + sideA*sideA) || (sideB*sideB ==sideC*sideC + sideA*sideA) ||(sideA*sideA ==sideC*sideC + sideB*sideB))
        {
System.out.println("Congradulations! Your have right-aligned triangle");
        }
        else{
            System.out.println("You have triangle with different sides.");
        }


    }
}
