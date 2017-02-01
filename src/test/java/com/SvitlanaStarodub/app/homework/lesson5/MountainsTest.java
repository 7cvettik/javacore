package com.SvitlanaStarodub.app.homework.lesson5;

import junitparams.JUnitParamsRunner;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by user on 02.02.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MountainsTest {
    @Before
    public void setUp(){
        Mountains  mountains = new Mountains();
    }

    @Test
    @FileParameters(value ="src/test/resources/DataDriven.txt", mapper =CsvWithHeaderMapper.class)
    public void highMountains(int A,String expected )  {
        MountainsTest unit = new MountainsTest();
        Assert.assertEquals(expected, Mountains.highMountains(A));

        }


    @Before
    public void setting(){
        Mountains  mountains = new Mountains();
    }
    @Test
    @FileParameters(value ="src/test/resources/mountains.txt", mapper =CsvWithHeaderMapper.class)
    public void middleMountains(int A,String expected)  {
        MountainsTest unit = new MountainsTest();
        Assert.assertEquals(expected, Mountains.highMountains(A));

    }
}