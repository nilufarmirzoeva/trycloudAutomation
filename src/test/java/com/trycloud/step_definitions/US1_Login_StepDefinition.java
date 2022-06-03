package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {

    }
    @Given("user use username {string} and password {string}")
    public void user_use_username_and_password(String username, String password) {
        loginPage.userInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.logInButton.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }









}

