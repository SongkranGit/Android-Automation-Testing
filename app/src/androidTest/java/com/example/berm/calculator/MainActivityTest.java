package com.example.berm.calculator;

import android.support.test.rule.ActivityTestRule;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by BERM-PC on 21/1/2560.
 */

public class MainActivityTest {

    @Rule
    public  ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void plus_2_2_should_be_4(){

        //Action
        onView(withId(R.id.edt_first_number)).perform(typeText("2"));

        onView(withId(R.id.edt_second_number)).perform(typeText("2"));

        onView(withId(R.id.btn_plus)).perform(click());

        //Assert
        onView(withId(R.id.tv_result)).check(matches(withText("4")));

    }

    @Test
    public void minus_2_2_should_be_0(){

        //Action
        onView(withId(R.id.edt_first_number)).perform(typeText("2"));

        onView(withId(R.id.edt_second_number)).perform(typeText("2"));

        onView(withId(R.id.btn_minus)).perform(click());

        //Assert
        onView(withId(R.id.tv_result)).check(matches(withText("0")));

    }

    @Test
    public void multiply_2_2_should_be_4(){

        //Action
        onView(withId(R.id.edt_first_number)).perform(typeText("2"));

        onView(withId(R.id.edt_second_number)).perform(typeText("2"));

        onView(withId(R.id.btn_multiply)).perform(click());

        //Assert
        onView(withId(R.id.tv_result)).check(matches(withText("4")));

    }


    @Test
    public void divide_4_2_should_be_2(){

        //Action
        onView(withId(R.id.edt_first_number)).perform(typeText("4"));

        onView(withId(R.id.edt_second_number)).perform(typeText("2"));

        onView(withId(R.id.btn_divide)).perform(click());

        //Assert
        onView(withId(R.id.tv_result)).check(matches(withText("2")));

    }
}
