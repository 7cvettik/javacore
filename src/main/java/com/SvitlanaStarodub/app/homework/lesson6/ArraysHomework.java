package com.SvitlanaStarodub.app.homework.lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 05.02.2017.
 */
public class ArraysHomework {
    //Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
    // отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки)
    public static void evenRow() {
        int[] arrayRow = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < arrayRow.length; i++) {
            System.out.print(arrayRow[i] + " ");
        }
    }

    public static void evenColumn() {
        int[] arrayColumn = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < arrayColumn.length; i++) {
            System.out.println(arrayColumn[i]);
        }
    }
//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран в другую строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)
    public static void odd() {
        int length = 0;
        for (int a = 1; a < 100; a++) {
            if (a % 2 != 0) length++;
        }
        //calculate length of array
        int[] oddArray = new int[length];
        int i = 0;
        for (int a = 1; a < 100; a++) {
            if (a % 2 != 0) {
                oddArray[i] = a;
                i++;
            }
        }
        //fill array
        for (int a = 1; a < 100; a++) {
            System.out.print(oddArray[i] + " ");
        }
        // output array a to z
        System.out.println();
        //println prints new line
        for (int k = oddArray.length - 1; k >= 0; k--) {
            System.out.print(oddArray[k] + " ");
        }
        // output array z to a
    }
//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке
    public static void randomArray() {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand(0, 9);
        }
        //fill in array with randomNumbers
        for (int b = 0; b < arr.length; b++) {
            System.out.print(arr[b] + " ");
        }
        //output array
        int d = 0;
        for (int c = 0; c < arr.length; c++) {
            if (arr[c] != 0 && arr[c] % 2 == 0) {
                d++;
            }
        }
        System.out.println();
        System.out.print("Count even " + d);
    }

    public static void randomShortForm() {
        int[] arr = new int[15];
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand(0, 9);
            System.out.print(arr[i] + " ");
            if (arr[i] != 0 && arr[i] % 2 == 0) {
                d++;
            }
        }
        //fill in array with randomNumbers and output array and check if it's even

        System.out.println();
        System.out.print("Count odd " + d);
    }

    public static int rand(int min, int max) {
        int randomNum = min + (int) (Math.random() * max);
        return randomNum;
    }
    //Создайте массив из 15 случайных целых чисел из отрезка [0;999].
// Выведите массив на экран. Выведите минимальное и максимальное значение элементов массива
    public static void minMaxValue() {
        int[] array = new int[15];
        for (int e = 0; e < array.length; e++) {
            array[e] = rand(0, 999);
            System.out.print(array[e] + " ");
        }
        System.out.println();
        int min = 1000;
        int max = 0;
        for (int e = 0; e < array.length; e++) {
            if (array[e] < min) min = array[e];
            if (array[e] > max) max = array[e];
        }
        System.out.println("Min value = " + min);
        System.out.println("Max value = " + max);
    }

    // Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
    // Вывести массив на экран.

    public static void multiDimention() {
        int[][] arr = new int[8][5];
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                arr[j][k] = rand(10, 99);
                System.out.print(arr[j][k]+ " ");
            }
            System.out.println(" ");

        }
    }

    // Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [1;999].
    // Вывести массив на экран в виде матрицы, где в каждом столбце числа должны быть выравнены по правому краю столбца
    public static void rightAlign() {
        int[][] arr = new int[8][5];
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                arr[j][k] = rand(1, 999);
                if (arr[j][k]<10)System.out.print("   "+arr[j][k]);
                else if (arr[j][k]<100)System.out.print("  "+arr[j][k]);
                else System.out.print(" "+arr[j][k]);
            }
            System.out.println(" ");
        }
    }

    //Запросить у пользователя ввести ряд чисел c вводом по одному через Enter (запрашиваем число - ввел число - Enter - запрашиваем следующее).
    // Ввод должен прерываться словом “exit”, о чем нужно сообщить пользователю (если пользователь ввел “exit” - больше не запрашиваем числа).
    // После прерывания ввода - вывести сумму всех введенных пользователем чисел.
    public static void astericsTask () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String a;
        do {
            System.out.println("Please enter a number  , for exit type 'exit'");
            a = scanner.next();
            try {
                int value = Integer.parseInt(a);
                sum = sum + value;
            } catch (NumberFormatException e) {
                System.out.println("");
            }
        }
        while (!a.equals("exit"));
        System.out.println("Sum is " + sum);
    }

}

