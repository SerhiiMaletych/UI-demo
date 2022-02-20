package com.pages;

import com.setup.allure.AllureLogger;

public class Pages extends AllureLogger {

    private static MainPage mainPage;

    public static MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }
}