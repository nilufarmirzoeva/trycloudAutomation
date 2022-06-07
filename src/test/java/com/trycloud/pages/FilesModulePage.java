package com.trycloud.pages;

import com.google.common.io.Files;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModulePage extends LoginPage {
    public FilesModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesModules;


    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement AllCheckbox;

    @FindBy(xpath = "//td[@class='selection']")
    public List<WebElement> CheckBoxList;

    //  @FindBy(xpath = "//td[@class='selection']//input[@type='checkbox']")
    //  public List<WebElement> checkBoxList;
    public void verifyAllBoxesChecked(List<WebElement> allBoxes) {
        for (WebElement eachBox : allBoxes) {
            Assert.assertTrue(eachBox.isSelected());
        }
    }
}