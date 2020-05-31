package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NavigationTest extends BaseTest {

    @Test
    public void careerPageTest() {
        driver.get(BASE_URL + "/career");

        WebElement careerNavItemButton = driver.findElement(By.cssSelector("nav > a[href='/career']"));

        String header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Карьера", header);

        boolean headerCareer = driver.findElement(By.className("gb-header__content")).isDisplayed();
        boolean footerCareer = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        assertTrue(headerCareer);
        assertTrue(footerCareer);
    }

    @Test
    public void testsPageTest() {
        driver.get(BASE_URL + "/tests");

        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Тесты", header);

        boolean headerTests = driver.findElement(By.className("gb-header__content")).isDisplayed();
        boolean footerTests = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        assertTrue(headerTests);
        assertTrue(footerTests);
    }

    @Test
    public void coursesPageTest() {
        driver.get(BASE_URL + "/courses");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//div/div/button[*]")).click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Курсы", header);

        boolean headerCourses = driver.findElement(By.className("gb-header__content")).isDisplayed();
        boolean footerCourses = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        assertTrue(headerCourses);
        assertTrue(footerCourses);
    }

    @Test
    public void webinarPageTest() {
        driver.get(BASE_URL + "/events");

        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Вебинары", header);

        boolean headerEvents = driver.findElement(By.className("gb-header__content")).isDisplayed();
        boolean footerEvents = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        assertTrue(headerEvents);
        assertTrue(footerEvents);
    }

    @Test
    public void forumPageTest() {
        driver.get(BASE_URL + "/topics");

        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Форум", header);

        boolean headerForum = driver.findElement(By.className("gb-header__content")).isDisplayed();
        boolean footerForum = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        assertTrue(headerForum);
        assertTrue(footerForum);
    }

    @Test
    public void blogPageTest() {
        driver.get(BASE_URL + "/posts");

        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Блог", header);

        boolean headerBlog = driver.findElement(By.className("gb-header__content")).isDisplayed();
        boolean footerBlog = driver.findElement(By.className("site-footer__icons")).isDisplayed();
        assertTrue(headerBlog);
        assertTrue(footerBlog);
    }
}
