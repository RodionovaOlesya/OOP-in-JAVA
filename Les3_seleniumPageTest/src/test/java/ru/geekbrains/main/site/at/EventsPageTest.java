package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class EventsPageTest extends BaseTest {

    @Test
    void eventsPageTest() {
        driver.get(BASE_URL + "/events");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Вебинары", header);

        boolean isHeaderDisplayed = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(isHeaderDisplayed);

        boolean isFooterDisplayed = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(isFooterDisplayed);
    }
}