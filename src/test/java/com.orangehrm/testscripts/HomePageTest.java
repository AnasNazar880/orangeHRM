package com.orangehrm.testscripts;

import com.aventstack.extentreports.ExtentTest;
import com.orangehrm.automationcore.Base;
import com.orangehrm.reports.TestListener;

public class HomePageTest extends Base {
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();
}
