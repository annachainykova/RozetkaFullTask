package com.masteringselenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DriverFactory {
    private static ThreadLocal <WebDriverThread> driverThread;

    @BeforeSuite
    public static void instantiateDriverObject() {
        driverThread = new ThreadLocal<WebDriverThread>() {

            protected WebDriverThread initiateValue() {
                WebDriverThread webDriverThread = new WebDriverThread();
                return webDriverThread;
            }
        };
    }


    public static WebDriver getDriver() throws Exception {
        return driverThread.get().getDriver();
    }

    @AfterMethod
    public static void quitDriver() throws Exception {
        driverThread.get().getDriver();
    }

}
