package com.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    WebDriver driver;
    @FindBy(how= How.XPATH, xpath = ".//input[@placeholder='Поиск']")
    WebElement searchInput;
    @FindBy(how=How.XPATH, xpath = ".//button[@type='submit']")
    WebElement submitSearchButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://rozetka.com.ua/");
    }

    public void searchForIphone(String textToSearch) {
        searchInput.sendKeys(textToSearch);
        submitSearchButton.click();

    }

}
