package com.SvitlanaStarodub.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by user on 13.02.2017.
 */
public class StringManipulations {
    public static void main(String[] args) {
    /*    String name = "Lolo";
        String surname = name.concat("Trolo");
        System.out.print(surname);
    }

    public static void convertToString() {
        String line = "";
        char[] arr = {'a', 'b', 'c'};
        for (int i = 0; i < arr.length; i++) {
           line +=arr[i];
           // Arrays.toString(arr); - version 2
            //System.out.println(arr);
            System.out.println(line);

        }
    }*/
    }
        public static void convertPrimitiveToString () {
            int a = 123;
            Integer ab = new Integer(a);
            String convertToString = String.valueOf(ab);
            System.out.println(convertToString);

            String test = "567";
            int stringToInt = Integer.valueOf(test);
            System.out.println(stringToInt);

            Double doubleValue = new Double(9.08);
            //double value = 9.08;
            String stringToDouble = String.valueOf(doubleValue);


        }
    }


