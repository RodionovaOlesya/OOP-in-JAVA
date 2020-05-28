package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CoursesPageTest extends BaseTest {

    @Test
    void coursesPageTest() {
        driver.get(BASE_URL + "/courses");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/button[*]")).click();

        String header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Курсы", header);

        boolean isHeaderDisplayed = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(isHeaderDisplayed);

        boolean isFooterDisplayed = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(isFooterDisplayed);
    }
}
