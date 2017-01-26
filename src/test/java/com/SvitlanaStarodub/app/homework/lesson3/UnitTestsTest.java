package com.SvitlanaStarodub.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 25.01.2017.
 */


public class UnitTestsTest {


    @Test
    public void arraySort()  {
        UnitTests unitTests = new UnitTests();
        Assert.assertTrue(unitTests.arraySort());

    }

    @Test
    public void ageNegativeMore() {
        UnitTests unitTests = new UnitTests();
        Assert.assertFalse(unitTests.age(36));
    }

    @Test
    public void ageNegativeLess() {
        UnitTests unitTests = new UnitTests();
        Assert.assertFalse(unitTests.age(29));
    }

    @Test
    public void age() {
        UnitTests unitTests = new UnitTests();
        Assert.assertTrue(unitTests.age(32));
    }

    @Test
    public void concatText() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("Sky",unitTests.concatText("S","ky"));
    }



    @Test
    public void division(){
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(10,unitTests.division(100, 10));
    }

    @Test
    public void divisionNegative(){
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(-5,unitTests.division(10, -2));
    }

    @Test
    public void subtraction() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(-12,unitTests.subtraction(10, 22));
    }

    @Test
    public void subtractionNegative() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(3,unitTests.subtraction(6, 3));
    }
    @Test
    public void addition()  {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(12,unitTests.addition(6,6));
    }
    @Test
    public void text(){
    UnitTests unitTests = new UnitTests();
    Assert.assertEquals("Testing",unitTests.text("Testing"));
}
}