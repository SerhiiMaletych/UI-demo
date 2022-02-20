package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class MainPage {
    SelenideElement allProductsButton = element(By.xpath("//a[@id='nav-hamburger-menu']"));
    SelenideElement filterButton = element(By.id("searchDropdownBox"));
    SelenideElement searchForField = element(By.id("twotabsearchtextbox"));
    SelenideElement todayDealsButton = element(By.xpath("//div[@id='nav-xshop']/a[1]"));
    SelenideElement currency = element(By.xpath("//a[@id='icp-touch-link-cop']/span[@class='icp-color-base']"));

    public void clickAllProductsButton() {
        allProductsButton.click();
    }

    public void filter(String text) {
        filterButton.sendKeys(text);
    }

    public void searchFor(String text) {
        searchForField.sendKeys(text);
        searchForField.submit();
    }

    public void goToTodayDeals() {
        todayDealsButton.click();
    }


    public String currentCurrency() {
        String temp  = currency.getText();
        return temp;
    }






}
