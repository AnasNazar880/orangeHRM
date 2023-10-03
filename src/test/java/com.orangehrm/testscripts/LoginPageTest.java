package com.orangehrm.testscripts;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.orangehrm.automationcore.Base;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.reports.TestListener;
import com.orangehrm.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
public class LoginPageTest extends Base {
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();
    HomePage home;
    @Test(groups = {"smoke"})
    public void verifyLoginPageTitle() {
        extentTest.get().assignCategory("smoke");
        List<List<String>> data = ExcelUtility.excelDataReader("LoginPage");
        LoginPage login = new LoginPage(driver);
        String actualTitle = login.getLoginPageTitle();
        extentTest.get().log(Status.PASS,"login page title received as"+actualTitle);
        String expectedTitle = data.get(0).get(1);
        Assert.assertEquals(actualTitle, expectedTitle, "login page Title mismatch  found");
        extentTest.get().log(Status.PASS,"expected login page title "+expectedTitle+" matched with actual title "+actualTitle);
    }
    @Test(groups = {"sanity"})
    public void verifyUserLoginCredentials(){
        extentTest.get().assignCategory("sanity");
        List<List<String>> data = ExcelUtility.excelDataReader("LoginPage");
        String userName=data.get(1).get(1);
        String passWord=data.get(2).get(1);
        String expectedUserAccountName=data.get(3).get(1);
        LoginPage login=new LoginPage(driver);
        home=login.loginToTheApplication(userName,passWord);
        String actualUserAccountName=home.getUserAccountNameText();
        Assert.assertEquals(actualUserAccountName,expectedUserAccountName,"user login failed");
    }
}
