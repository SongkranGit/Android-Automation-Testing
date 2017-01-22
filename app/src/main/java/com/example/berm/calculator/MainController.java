package com.example.berm.calculator;

/**
 *  Controller is controller requests and sending to view
 *
 *
 *
 * */



public class MainController {

    MainView mainView;
    Calculator calculator;
    private int firstNumber;
    private int secondNumber;


    public MainController(MainView mainView) {
        this.mainView = mainView;
        calculator = new Calculator();
    }

    public void plus(){
        int result = calculator.plus(firstNumber , secondNumber);
        mainView.sendResult(String.valueOf(result));
    }


    public void minus(){
        int result = calculator.minus(firstNumber , secondNumber);
        mainView.sendResult(String.valueOf(result));
    }

    public void multiply(){
        int result = calculator.multiply(firstNumber , secondNumber);
        mainView.sendResult(String.valueOf(result));
    }

    public void divide(){
        int result = calculator.divide(firstNumber , secondNumber);
        mainView.sendResult(String.valueOf(result));
    }

    public void setupInput(int firstNumber , int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

}
