package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CareerPageTest extends BaseTest {

    @Test
    void careerPageTest() {
        driver.get(BASE_URL + "/career");

        // создаем переменную типа WebElement и присваиваем ей значение - результат поиска по css селектору
        //WebElement careerNavItemButton = driver.findElement(By.cssSelector("nav > a[href='/career']"));
        driver.findElement(By.cssSelector("nav > a[href='/career']")).click();
         // Теперь не боимся что тест упадет
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Карьера", header);

        boolean isHeaderDisplayed = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(isHeaderDisplayed);

        boolean isFooterDisplayed = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(isFooterDisplayed);
    }
}