package com.SvitlanaStarodub.runners.homework.lesson6;

import com.SvitlanaStarodub.app.homework.lesson6.ArraysHomework;
import com.SvitlanaStarodub.app.homework.lesson6.InputArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 07.02.2017.
 */
public class MenuArrays {
    public static void main(String[] args) {
        int menuItem;
        do {
            System.out.println("Please choose the number to continue work with the programms.");
            System.out.println(" 1 : Call array by row.");
            System.out.println(" 2 : Call array by column.");
            System.out.println(" 3 : Enter odd numbers: decrease or increase");
            System.out.println(" 4: Call an array of even numbers in diapason 0,9 and count amount of even numbers");
            System.out.println(" 5: Call an array of even numbers in diapason 0,999 and enter min/max values");
            System.out.println(" 6: Call multi-dimention array");
            System.out.println(" 7: Multi-dimention array is aligned by right side");
            System.out.println(" 8: Sum of unknown numbers entered by user");
            System.out.println(" 9: Quit");
            menuItem = InputArrays.intInput("");
            switch (menuItem) {
                case 1:
                    ArraysHomework.evenRow();
                    break;
                case 2:
                    ArraysHomework.evenColumn();
                    break;
                case 3:
                    ArraysHomework.odd();
                case 4:
                    ArraysHomework.randomArray();
                    break;
                case 5:
                    ArraysHomework.minMaxValue();
                    break;
                case 6:
                    ArraysHomework.multiDimention();
                case 7:
                    ArraysHomework.rightAlign();
                    break;
                case 8:
                    ArraysHomework.astericsTask();
                    break;

            }

        }
        while (menuItem != 9);
    }

}
