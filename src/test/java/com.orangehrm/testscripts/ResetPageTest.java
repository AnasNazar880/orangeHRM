package com.orangehrm.testscripts;

import com.aventstack.extentreports.ExtentTest;
import com.orangehrm.reports.TestListener;
import org.testng.annotations.Test;

public class ResetPageTest {
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();
}
