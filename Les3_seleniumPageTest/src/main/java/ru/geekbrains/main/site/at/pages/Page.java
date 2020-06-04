package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Page extends BasePage {

    public static By headerSelector = By.className("gb-header__title");

    private WebDriver driver;

    private NavigationTab navigationTab;

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new NavigationTab(driver);
    }

    public Page checkHeader(String expected) {
        assertEquals(expected, driver.findElement(headerSelector)
                .getText());
        return this;
    }

    public NavigationTab getNavigationTab() {
        return navigationTab;
    }
}
