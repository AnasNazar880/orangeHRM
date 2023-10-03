package com.orangehrm.pages;

import com.orangehrm.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestHelperUtility {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//li[@class='oxd-userdropdown']//span//p[@class='oxd-userdropdown-name']")
    WebElement userAccountName;
    public String getUserAccountNameText(){
        wait.hardWait();
       return webElement.getElementText(userAccountName);
    }
}
