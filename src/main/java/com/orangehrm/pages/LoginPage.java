package com.orangehrm.pages;


import com.orangehrm.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestHelperUtility {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and @name='username']")
    WebElement userName;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and @name='password']")
    WebElement passWord;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement loginButton;

    public String getLoginPageTitle() {
        return webDriver.getTitleOfPage(driver);
    }
    public void enterUserName(String uName){
        wait.fluentWaitForVisibilityOfElementByXpath(driver,"//input[@class='oxd-input oxd-input--active' and @name='username']");
        webElement.enterText(userName,uName);
    }
    public void enterPassWord(String pWord){
        webElement.enterText(passWord,pWord);
    }
    public void clickLoginButton(){
    webElement.clickOnElement(loginButton);
    }

    public HomePage loginToTheApplication(String userName,String passWord){
        enterUserName(userName);
        enterPassWord(passWord);
        clickLoginButton();
        return new HomePage(driver);
    }
}
