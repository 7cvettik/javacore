package com.SvitlanaStarodub.app.homework.lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 01.02.2017.
 */
public class PrimitiveConvertorTest {
    @Test
    public void floatToChar()  {
        PrimitiveConvertorTest floatToChar = new PrimitiveConvertorTest();
        assertEquals('A',PrimitiveConvertor.floatToChar(65.0f));
    }

    @Test
    public void intToChar()  {
        PrimitiveConvertorTest intToChar = new PrimitiveConvertorTest();
        assertEquals('a',PrimitiveConvertor.intToChar (97));
    }

    @Test
    public void charToInt()  {
        PrimitiveConvertorTest charToInt = new PrimitiveConvertorTest();
        assertEquals(97,PrimitiveConvertor.charToInt('a'));
    }

}
