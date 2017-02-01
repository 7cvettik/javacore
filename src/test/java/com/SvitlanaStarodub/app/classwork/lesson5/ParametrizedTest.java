package com.SvitlanaStarodub.app.classwork.lesson5;

import com.SvitlanaStarodub.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by user on 30.01.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class ParametrizedTest {
    MathFunc mathFunc;

    @Before
    public void setUp(){
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value ="src/test/resources/multiplyData.csv", mapper =CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected){
        Assert.assertEquals(expected, mathFunc.multiply(a,b));
    }

}
