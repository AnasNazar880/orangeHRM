package com.orangehrm.pages;

import com.orangehrm.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResetPage extends TestHelperUtility {
    WebDriver driver;
    public ResetPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
}
