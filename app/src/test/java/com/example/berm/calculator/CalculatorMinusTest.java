package com.example.berm.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by BERM-PC on 21/1/2560.
 */

public class CalculatorMinusTest {

    Calculator calculator = new Calculator();

    @Test
    public void minus_2_2_should_be_zero() {

        int result = calculator.minus(2, 2);

        assertEquals(0, result);

    }



}
