package com.SvitlanaStarodub.app.classwork.lesson8;

/**
 * Created by user on 09.02.2017.
 */
public class SwitchArrays {
    public static void bubbleSorting(){

        int maxValue =0;
        boolean result;

        int []arr = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        System.out.println("initial array");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

            do {
                result= false;
                for (int i = 0; i < arr.length - 1; i++) {

                    if (arr[i] > arr[i + 1]) {
                        maxValue = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = maxValue;
                        result = true;
                    }

                }
            }
            while (result);
        System.out.println("sorted array");
        for ( int i=0;i<arr.length;i++) {

            System.out.print(arr[i] + " ");
        }



    }
}
