package com.SvitlanaStarodub.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 23.01.2017.
 */
public class MathFuncTest {
    @Test
    public void multiply() {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(6, mathFunc.multiply(2, 3));
    }

}