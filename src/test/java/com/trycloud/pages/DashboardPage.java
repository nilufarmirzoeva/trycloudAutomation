package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//ul[@id='appmenu']//span")
    public List<WebElement> allMainModules;


    public List<String> getTextOfModules() {
        List<String> moduleTexts = new ArrayList<>();

        for (WebElement module : allMainModules) {

            BrowserUtils.sleep(1);
            moduleTexts.add(module.getText());
        }
        return moduleTexts;
    }

}