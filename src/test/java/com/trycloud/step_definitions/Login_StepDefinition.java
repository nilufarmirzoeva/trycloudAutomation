package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {

    }
    @And("user use username {string} and password {string} and click login")
    public void user_use_username_and_password_and_click_login(String username, String password) {

        loginPage.login(username,password);

    }



}

