package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationTest extends BaseTest {

    @Test
    void navigationPanelTest() {
        driver.get(BASE_URL + "/career");
        String header;

        //Карьера
        WebElement careerNavItemButton = driver.findElement(By.cssSelector("nav > a[href='/career']"));
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Карьера", header);
        boolean headerCareer = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(headerCareer);
        boolean footerCareer = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(footerCareer);

        // Тесты
        driver.findElement(By.cssSelector("nav > a[href='/tests']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Тесты", header);
        boolean headerTests = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(headerTests);
        boolean footerTests = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(footerTests);

        //Курсы
        driver.findElement(By.cssSelector("nav.gb-left-menu__nav .svg-icon.icon-courses")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//div/div/button[*]")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Курсы", header);
        boolean headerCourses = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(headerCourses);
        boolean footerCourses = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(footerCourses);

        //Вебинары
        driver.findElement(By.cssSelector("nav > a[href='/events']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Вебинары", header);
        boolean headerEvents = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(headerEvents);
        boolean footerEvents = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(footerEvents);

        //Форум
        driver.findElement(By.cssSelector("nav > a[href='/topics']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Форум", header);
        boolean headerForum = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(headerForum);
        boolean footerForum = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(footerForum);

        //Блог
        driver.findElement(By.cssSelector("nav > a[href='/posts']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Блог", header);
        boolean headerBlog = driver.findElement(By.className("gb-header__content")).isDisplayed();
        Assertions.assertTrue(headerBlog);
        boolean footerBlog = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        Assertions.assertTrue(footerBlog);
    }
}
