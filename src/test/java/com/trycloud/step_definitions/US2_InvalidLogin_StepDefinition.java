package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_InvalidLogin_StepDefinition {

    LoginPage loginPage = new LoginPage();
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        loginPage.userInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);

    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String message) {
        Assert.assertEquals(message,loginPage.invalidLoginMessage.getText());
    }

}
