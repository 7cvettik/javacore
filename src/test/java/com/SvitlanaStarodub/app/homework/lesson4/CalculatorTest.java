package com.SvitlanaStarodub.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 01.02.2017.
 */
public class CalculatorTest {
    @Test
    public void circleArea1More() {
        CalculatorTest unit = new CalculatorTest();
        Assert.assertEquals(1, Calculator.circleCalculator(5, 3));
    }

    @Test
    public void circleArea1Less() {
        CalculatorTest unit = new CalculatorTest();
        Assert.assertEquals(2, Calculator.circleCalculator(3, 7));
    }

    @Test
    public void circleAreasEqual() {
        CalculatorTest unit = new CalculatorTest();
        Assert.assertEquals(3, Calculator.circleCalculator(7, 7));
    }

    @Test
    public void numbersTypeOdd() {
        CalculatorTest unit = new CalculatorTest();
        Assert.assertTrue(Calculator.numbersTypeCalculator(8));
    }

    @Test
    public void numbersTypeEven() {
        CalculatorTest unit = new CalculatorTest();
        Assert.assertFalse(Calculator.numbersTypeCalculator(7));
    }

    @Test
    public void triangleRightAngled() {
        CalculatorTest unit = new CalculatorTest();
        Assert.assertTrue(Calculator.triangleCalculator(3, 4, 5));
    }

    @Test
    public void triangleOppositeRightAngled() {
        CalculatorTest unit = new CalculatorTest();
        Assert.assertFalse(Calculator.triangleCalculator(2, 4, 9));
    }
}