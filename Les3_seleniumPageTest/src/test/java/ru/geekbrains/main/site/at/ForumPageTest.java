package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ForumPageTest extends BaseTest {

    @Test
    void forumPageTest() {
        driver.get(BASE_URL + "/topics");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        boolean isHeaderDisplayed = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(isHeaderDisplayed);

        boolean isFooterDisplayed = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(isFooterDisplayed);
    }
}
