package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US4_FileModule_stepDefinition {

    LoginPage loginPage= new LoginPage();
    DashboardPage dashboardPage =new DashboardPage();
    FilesModulePage fileModulePage = new FilesModulePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.login("User2","Userpass123");



    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        fileModulePage.filesModules.click();

    }
    @Then("verify the page title is {string}.")
    public void verify_the_page_title_is(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));


    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        fileModulePage.filesModules.click();
        fileModulePage.AllCheckbox.click();

    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        fileModulePage.verifyAllBoxesChecked(fileModulePage.CheckBoxList);

    }

}