package com.carina.step_definitions;

import com.carina.pages.HomePage;
import com.carina.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class LanguageSelection_StepDefinition {

    HomePage homePage = new HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Actions actions = new Actions(Driver.getDriver());

    @When("user however a language selection module")
    public void user_however_a_language_selection_module() throws InterruptedException {
        actions.moveToElement(homePage.languageSelect).perform();
        Thread.sleep(2000);
    }

    @When("users clicks espaniol button")
    public void users_clicks_espaniol_button() throws InterruptedException {
        homePage.espaniolButton.click();
        Thread.sleep(3000);
    }

    @Then("user sees the {string} text")
    public void user_sees_the_text(String string) {
        Assert.assertTrue(homePage.holaIdentification.isDisplayed());
    }


}
