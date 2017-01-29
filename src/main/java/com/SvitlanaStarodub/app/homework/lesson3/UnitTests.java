package com.SvitlanaStarodub.app.homework.lesson3;
import java.util.Arrays;

/**
 * Created by user on 25.01.2017.
 */
public class UnitTests {
    public int addition(int a, int b) {
        return (a + b);
    }

    public String text(String a) {
        return a;
    }

    public int subtraction(int x, int y) {
        return (x - y);
    }

    public int division(int a, int b) {
        return (a / b);
    }

    public String concatText(String a, String b) {
        return a + b;
    }

    public boolean age(int a) {
        boolean middleAge;
        if (a > 30 & a < 35) middleAge = true;
        else middleAge = false;
        return middleAge;
    }

    public boolean arraySort (){
        boolean result = true;
        int[] a ={2,1,8,33, 101, -5};
        Arrays.sort(a);
        for (int i=0; i<=4; i++) {
            if (a[i] > a[i + 1]) result = false;
        }
        return result;
    }

    public String chooseColour(int number) {
        String colour = "";
        switch (number){
            case 1: colour = "red";
            break;
            case 2: colour = "blue";
            break;
            case 3: colour = "yellow";
            break;
            case 4: colour = "pink";
            break;
            case 5: colour = "green";
            break;
            case 6: colour = "orange";
            break;
            case 7: colour = "brown";
            break;
            case 8: colour = "purple";
            break;
            default: colour = "black";
        }
        return colour;
    }

}


