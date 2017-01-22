package com.example.berm.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by BERM-PC on 22/1/2560.
 */

public class MainControllerTest {

    @Test
    public void plus(){

        final boolean[] called = {false};

        // Anonimus class
        MainView mainView = new MainView() {
            @Override
            public void sendResult(String result) {
                called[0] = true;
            }
        };

        //Act
        MainController mainController = new MainController(mainView);
        mainController.plus();

        //Assert
        Assert.assertTrue("Method sendResult must be called" , called[0]);


    }


}
