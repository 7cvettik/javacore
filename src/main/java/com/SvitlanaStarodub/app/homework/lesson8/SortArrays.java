package com.SvitlanaStarodub.app.homework.lesson8;

import java.lang.reflect.Array;

/**
 * Created by user on 12.02.2017.
 */
public class SortArrays {
public static int [] bubblesAscending (int []arr) {

    int maxValue = 0;
    boolean result;

    do {
        result = false;
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
    return arr;
}
public static int [] bubblesDescending (int [] arr){
    int minValue =0;
    boolean result;

    do{
        result = false;
        for (int i =arr.length - 1; i>0;i-- ){
            if(arr[i-1]< arr[i]){
                minValue = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = minValue;
                result = true;
            }

        }
    }
    while(result);
    return arr;
}

 /*   public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }*/

}


