package com.setup.base;

import com.codeborne.selenide.Selenide;

import com.setup.allure.AllureLogger;
import com.setup.config.SelenideConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class BaseTest extends AllureLogger {

    @BeforeMethod(alwaysRun = true, description = "Opening web browser...")
    public void setUp() {
        logInfo("Creating web driver configuration...");
        SelenideConfig.createBrowserConfig(System.getProperty("selenide.browser", "chrome"));

        logInfo("Open browser...");
    }

    @AfterMethod(alwaysRun = true, description = "Closing web browser...")
    public void tearDown() {

        Selenide.closeWebDriver();
        logInfo("Web driver closed!");
    }
}
