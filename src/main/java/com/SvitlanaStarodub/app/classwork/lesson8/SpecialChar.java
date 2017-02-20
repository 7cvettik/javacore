package com.SvitlanaStarodub.app.classwork.lesson8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 09.02.2017.
 */
public class SpecialChar {

        public static void main (String[] args) {


            char[] arr = new char[256];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (char) i;

            }
            //1
            String result = Arrays.toString(arr);
            //2

            System.out.println(result);
            //System.out.println(Arrays.toString(arr)); 3
        }
    }





