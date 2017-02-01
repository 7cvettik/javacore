package com.SvitlanaStarodub.app.homework.lesson2;

/**
 * Created by user on 22.01.2017.
 */
public class PrimitiveConvertor {
    public static char floatToChar (float float_variable_name){

        char char_variable_name = (char) float_variable_name;
        System.out.println("Input float value is "+ float_variable_name + ". Output char value is " + char_variable_name );
        return char_variable_name;
    }
    public static char intToChar (int int_variable_name){
        char char_variable_name = (char) int_variable_name;
        System.out.println("Input int value is "+ int_variable_name + ". Output char value is " + char_variable_name );
        return char_variable_name;

    }
    public static int charToInt (char char_variable_name){
        int int_variable_name = char_variable_name;
        System.out.println("Input char value is "+ char_variable_name + ". Output int value is " + int_variable_name );
        return int_variable_name;
    }


}
