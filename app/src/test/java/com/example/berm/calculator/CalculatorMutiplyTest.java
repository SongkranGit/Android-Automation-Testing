package com.example.berm.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by BERM-PC on 21/1/2560.
 */

public class CalculatorMutiplyTest {


    Calculator calculator = new Calculator();

    @Test
    public void multiply_2_2_should_be_4() {

        int result = calculator.multiply(2, 2);

        assertEquals(4, result);

    }
}
