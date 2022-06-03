package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US3_AllMainModules_stepDefinition {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();


    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        String username = ConfigurationReader.getProperty("user1");
        String password = ConfigurationReader.getProperty("pass");
        loginPage.login(username, password);
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {
        List<String> actualModules = new ArrayList<>();
        dashboardPage.allMainModules.forEach(p->actualModules.add(p.getText()));
        Assert.assertEquals(expectedModules, actualModules);
    }
}