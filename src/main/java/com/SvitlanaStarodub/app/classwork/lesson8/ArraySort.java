package com.SvitlanaStarodub.app.classwork.lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by user on 09.02.2017.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] someArray = {1, 5, 7, 2, 0};
        Arrays.sort(someArray);

        System.out.println("Sorted array: " + Arrays.toString(someArray));

        System.out.println ("Char array:\n" + Arrays.toString(someArray));
    }


}
