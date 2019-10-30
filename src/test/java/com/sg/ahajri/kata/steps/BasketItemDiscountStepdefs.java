package com.sg.ahajri.kata.steps;

import com.sg.ahajri.kata.bean.Basket;
import com.sg.ahajri.kata.bean.BasketItem;
import cucumber.api.java8.En;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BasketItemDiscountStepdefs implements En {
    BasketItem apple, orange, watermelon;

    Basket basket;

    @Given("^Prepare basket for apple$")
    public void prepareBasketForApple() {
        basket = new Basket();
    }

    @When("^Buy (\\d+) apples$")
    public void setAppleCount(Integer appleCount) {
        System.out.println(" apple count: " + appleCount);
        apple = new BasketItem("Apple", 0.2, appleCount, 2, 1);
    }

    @Then("^Get \"([^\"]*)\" apple discounted price$")
    public void claculteApplePrice(double discountedPrice) {
        Assert.assertEquals(discountedPrice, apple.getDiscountedPrice(),0.0);
    }
}
