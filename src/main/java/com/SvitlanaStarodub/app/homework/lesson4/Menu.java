package com.SvitlanaStarodub.app.homework.lesson4;

import java.util.Scanner;



/**
 * Created by user on 29.01.2017.
 */
public class Menu {
    public static void main (String [] args) {
    int menuItem;
        do {
            System.out.println("Please choose the number to continue work with the programms.");
            System.out.println(" 1 : Right-angled triangles.");
            System.out.println(" 2 : Calculate circle area.");
            System.out.println(" 3 : Odd/Even Numbers");
            System.out.println(" 4: Quit");
            menuItem = Inputs.intInput("");
            switch (menuItem) {
                case 1:
                    TriangleHomework.triangle();
                    break;
                case 2:
                    Circle.circle();
                    break;
                case 3:
                    OddEvenHomework.numbersType();
                    break;
            }

        }
        while (menuItem != 4);
    }
 }



