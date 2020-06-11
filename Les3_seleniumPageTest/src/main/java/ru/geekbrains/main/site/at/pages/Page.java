package ru.geekbrains.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Page extends BasePage {

    @FindBy(className = "gb-header__title")
    private WebElement pageHeader;

    public static By headerSelector = By.className("gb-header__title");

    private WebDriver driver;

    private NavigationTab navigationTab;

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new NavigationTab(driver);
    }

    @Step("Check {expected} is header on page")
    public Page checkHeader(String expected) {
        assertEquals(expected, pageHeader.getText());
        return this;
    }

    @Step("In navigation tab")
    public NavigationTab getNavigationTab() {
        return navigationTab;
    }
}
