package com.SvitlanaStarodub.app.classwork.lesson6;

/**
 * Created by user on 02.02.2017.
 */
public class Arrays {
    public static void main(String[] args){
        int [] intArray = {1,2,3};
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
        boolean [] booleanArray = {true,false,true};
        for (int i=0; i<booleanArray.length;i++){
            System.out.println(intArray[i]);
        }

        char [] charArray = {'a','b','c'};
        for (int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        double [] doubleArray = {1.2,2.6,3.5};
        for (int i=0; i<doubleArray.length;i++){
            System.out.println(intArray[i]);
        }
        int [][] arr = new int [2][3];
        for (int j=0; j<arr.length; j++){
            for (int k=0; k<arr[j].length; k++){
                System.out.println(arr[j][k]=j*k);

            }
        }
    }

}
