package com.SvitlanaStarodub.app.homework.lesson9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 16.02.2017.
 */
public class StringHomework {
       public static boolean verifyWordOnPolindromTwo(String word) {

        char[] wordChar = word.toCharArray();
        char[] reverseWord = new char[wordChar.length];
        boolean result = false;
        for (int i = wordChar.length - 1; i >= 0; i--) {
            reverseWord[wordChar.length - 1 - i] = wordChar[i];
        }

        for (int i = 0; i < wordChar.length; i++) {
            if (reverseWord[i] == wordChar[i]) {
                result = true;
                System.out.println("The word is polindrom.");
            } else {
                return false;

            }
        }
        return result;
    }

    public static boolean verifyWordOnPolindromOne(String word) {
        char[] word2 = word.toCharArray();
        for (int i = 0; i < (word2.length) / 2; i++) {
            if (word2[i] != word2[word2.length - i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static boolean verifyWordOnPolindromThree(String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
                return false;
            }
        }
        return true;

    }

    public static void verifyWordOnPolindromFour  (String word) {
        String reverse = null;

        int length = word.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse += word.charAt(i);
            //System.out.println("Reverse = " + reverse);
        }
        if (word.equals(reverse)) {
            System.out.println(" Polindrom");
        } else {
            System.out.println("Not Polindrom");
        }
    }
}


