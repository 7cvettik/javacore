package com.SvitlanaStarodub.runners.homework.lesson9;

import com.SvitlanaStarodub.app.homework.lesson9.StringHomework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 */
public class StringRun {
    static StringHomework homework = new StringHomework();
    public static void main(String[] args) {

        String text = null;
        boolean result = false;
        do {
            Scanner textExample = new Scanner(System.in);
            System.out.println("Please enter one word ");
            text = textExample.next().toLowerCase();

            if (text.matches("^[a-zA-Z]+$0-9")) {
                result = true;
            } else {
                System.out.println("You entered invalid data. Try again.");
            }
        }
        while (result == false);
        System.out.println("Select algorithm." + "\n+" + "1 version." + "\n" + "2 version." + "\n" + "3 version."+"\n"+"4 version");
        Scanner menuAlgorithm = new Scanner(System.in);
        int algorithm = menuAlgorithm.nextInt();
        calledMethod(algorithm, text);
    }

public static void calledMethod(int number, String word)
    {
        switch(number) {
            case 1: homework.verifyWordOnPolindromOne(word);
                break;
            case 2: homework.verifyWordOnPolindromTwo(word);
                break;
            case 3: homework.verifyWordOnPolindromThree(word);
                break;
            case 4: homework.verifyWordOnPolindromFour(word);
        }
    }




    }




