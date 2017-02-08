package com.SvitlanaStarodub.app.classwork.lesson6;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by user on 02.02.2017.
 */
public class Loops {
    public static void loops() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter number a");
        int a = scanner.nextInt();
        System.out.print(" Please enter number b");

        int b = scanner.nextInt();

        while (a>b){
            System.out.println("Number a = "+ a + " Number b = " + b);
            a--;
        }

        System.out.println("Number a = "+ a + " Number b = " + b);

    }


    }




