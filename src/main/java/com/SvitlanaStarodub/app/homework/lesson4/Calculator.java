package com.SvitlanaStarodub.app.homework.lesson4;

/**
 * Created by user on 01.02.2017.
 */
public class Calculator {
    public static int circle(double radius1, double radius2){

        double circleArea1 = Math.PI * radius1 * radius1;
        double circleArea2 = Math.PI * radius2 * radius2;

        if (circleArea1 > circleArea2)
           return 1 ;
        else if (circleArea1 < circleArea2)
           return 2;
        else return 3;
    }

    public static boolean numbersType (int number) {

        if (number%2 == 0 ){
            return true;
        }
        else{
           return false;
        }
    }

    public static boolean triangle (double sideC, double sideB, double sideA) {
        if ((sideC*sideC==sideB*sideB + sideA*sideA) || (sideB*sideB ==sideC*sideC + sideA*sideA) ||(sideA*sideA ==sideC*sideC + sideB*sideB))
        {
            return true;
        }
        else{
           return false;
        }

    }
}
