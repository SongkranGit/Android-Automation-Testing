package com.example.berm.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;



interface MainView {
    void sendResult(String result);
}


public class MainActivity extends AppCompatActivity implements MainView {

    public static final String RESULT = "result";
    private Calculator calculator;
    private int firstNumber;
    private int secondNumber;
    private EditText edtFirstNumber;
    private EditText edtSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();
    }

    private void initial() {
        calculator = new Calculator();
        edtFirstNumber  = (EditText) findViewById(R.id.edt_first_number);
        edtSecondNumber = (EditText) findViewById(R.id.edt_second_number);
    }

    private  void setupInput(){
        firstNumber = Integer.valueOf( edtFirstNumber.getText().toString());
        secondNumber = Integer.valueOf(edtSecondNumber.getText().toString());
    }

    public void plus(View view) {
        setupInput();
        MainController mainController = new MainController(this);
        mainController.setupInput(firstNumber, secondNumber);
        mainController.plus();
    }

    public void minus(View view) {
        setupInput();
        MainController mainController = new MainController(this);
        mainController.setupInput(firstNumber, secondNumber);
        mainController.minus();
    }

    public void divide(View view){
        setupInput();
        MainController mainController = new MainController(this);
        mainController.setupInput(firstNumber, secondNumber);
        mainController.divide();
    }

    public void multiply(View view) {
        setupInput();
        MainController mainController = new MainController(this);
        mainController.setupInput(firstNumber, secondNumber);
        mainController.multiply();
    }

    @Override
    public void sendResult(String result) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(RESULT, result);
        startActivity(intent);
    }
}
