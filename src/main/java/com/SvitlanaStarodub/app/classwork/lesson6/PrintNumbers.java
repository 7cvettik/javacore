package com.SvitlanaStarodub.app.classwork.lesson6;

/**
 * Created by user on 02.02.2017.
 */
public class PrintNumbers {
    public static int example1() {
    //  int arrayNumber [] = {0,1,2,3,4,5,6,6,8,9,10};
    int a = 0;
    while (a <= 10) {
        System.out.print(a+ " ");
        a++;
    }
    return a;
}


    public static int example2 ()
    {
        int b = 0;
        do {
        System.out.print(b + " ");
        b++;
        }
        while (b<=10);
        return b;
    }

    public static int example3 ()
    {
        int c;
        for ( c=0; c<= 10; c++)
        {
            System.out.print(c + " ");
        }
        return c;
    }

    public static int incrementExamples (){
    int a = 1;
        System.out.println ("Origina a value " + a);

        System.out.println ("Post-increment a " + a++);
        System.out.println ("After post-increment " + a);
        System.out.println ("Pre-increment a " + ++a);
        System.out.println ("After pre-increment a " + a);
    return a;
}

}
