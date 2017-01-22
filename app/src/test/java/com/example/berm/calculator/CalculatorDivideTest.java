package com.example.berm.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by BERM-PC on 21/1/2560.
 */

public class CalculatorDivideTest {


    Calculator calculator = new Calculator();

    @Test
    public void divide_4_2_should_be_2(){

        int result = calculator.divide(4 , 2);
        assertEquals(2 , result);
    }

    @Test(expected = DividedByZeroException.class)
    public void divide_2_0_should_be_throw_divide_by_zero(){
        int result = calculator.divide(2 , 0);

        assertEquals(2 , result);
    }
}
