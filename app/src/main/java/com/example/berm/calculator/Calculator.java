package com.example.berm.calculator;

/**
 * Created by BERM-PC on 21/1/2560.
 */
public class Calculator {


    public int plus(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        return first - second;
    }


    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        if(second == 0){
            throw new DividedByZeroException();
        }
        return first / second;
    }
}
