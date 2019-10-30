package com.sg.ahajri.kata;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:basket_discount.feature" })
public class BasketItemDiscountTest {
}
