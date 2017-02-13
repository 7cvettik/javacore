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
            menuItem = Input.intInput("");
            switch (menuItem) {
                case 1:
                    Submenu.triangleSubmenu();
                    break;
                case 2:
                    Submenu.circleSubmenu();
                    break;
                case 3:
                    Submenu.numbersTypeSubmenu();
                    break;
            }

        }
        while (menuItem != 4);
    }





}
