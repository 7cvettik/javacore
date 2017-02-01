package com.SvitlanaStarodub.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 25.01.2017.
 */


public class UnitTestsTest {
    @Test
    public void chooseColour9() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("black", unitTests.chooseColour(9));
    }

    @Test
    public void chooseColour8() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("purple", unitTests.chooseColour(8));
    }

    @Test
    public void chooseColour7() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("brown", unitTests.chooseColour(7));
    }

    @Test
    public void chooseColour6() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("orange", unitTests.chooseColour(6));
    }

    @Test
    public void chooseColour5() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("green", unitTests.chooseColour(5));
    }

    @Test
    public void chooseColour4() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("pink", unitTests.chooseColour(4));
    }

    @Test
    public void chooseColour3() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("yellow", unitTests.chooseColour(3));
    }

    @Test
    public void chooseColour2() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("blue", unitTests.chooseColour(2));
    }

    @Test
    public void chooseColour1() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("red", unitTests.chooseColour(1));
    }

    @Test
    public void arraySort() {
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
        Assert.assertEquals("Sky", unitTests.concatText("S", "ky"));
    }


    @Test
    public void division() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(10, unitTests.division(100, 10));
    }

    @Test
    public void divisionNegative() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(-5, unitTests.division(10, -2));
    }

    @Test
    public void subtraction() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(-12, unitTests.subtraction(10, 22));
    }

    @Test
    public void subtractionNegative() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(3, unitTests.subtraction(6, 3));
    }

    @Test
    public void addition() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals(12, unitTests.addition(6, 6));
    }

    @Test
    public void text() {
        UnitTests unitTests = new UnitTests();
        Assert.assertEquals("Testing", unitTests.text("Testing"));
    }


}