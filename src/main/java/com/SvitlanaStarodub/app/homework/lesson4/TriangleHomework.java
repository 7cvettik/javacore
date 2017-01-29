package com.SvitlanaStarodub.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by user on 29.01.2017.
 */
public class TriangleHomework {
    public static void triangle (){
       String message1 = "Please enter first side ";
       String message2 = "Please enter second side ";
       String message3 = "Please enter third side ";

        double sideA = Inputs.doubleInput(message1);
        double sideB = Inputs.doubleInput(message2);
        double sideC = Inputs.doubleInput(message3);

        if ((sideC*sideC==sideB*sideB + sideA*sideA) || (sideB*sideB ==sideC*sideC + sideA*sideA) ||(sideA*sideA ==sideC*sideC + sideB*sideB))
        {
            System.out.println("Congradulations! Your have right-angled triangle");
        }
        else{
            System.out.println("You have triangle with different sides.");
        }


    }
}
