package com.example.berm.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by BERM-PC on 21/1/2560.
 */

public class CalculatorPlusTest {

    Calculator calculator = new Calculator();

    @Test
    public void plus_2_2_should_be_4() {
        //Arrange :: Initial objects

        //Act
        int result = calculator.plus(2, 2);

        //Assert
        assertEquals(4, result);
    }







}


