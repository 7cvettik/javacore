package com.SvitlanaStarodub.runners.homework.lesson8;

import com.SvitlanaStarodub.app.homework.lesson8.SortArrays;

/**
 * Created by user on 12.02.2017.
 */
public class ArrayPrint {
    public static void main (String[]args){
    int [] initialArr = {56, 178, -34, 78, 102, 0 };
    printArr(initialArr, "Original array");
    SortArrays.bubblesAscending(initialArr);
    printArr(initialArr, "Ascending array");
    SortArrays.bubblesDescending(initialArr);
    printArr(initialArr, "Descending array");
    /*SortArrays.doSelectionSort(initialArr);
    printArr(initialArr, "Ascending array");*/
    }

    public static void printArr (int [] array, String message){

        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
