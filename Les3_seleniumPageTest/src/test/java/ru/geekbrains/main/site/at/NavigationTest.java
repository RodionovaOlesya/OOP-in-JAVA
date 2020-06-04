package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.Base.BaseTest;
import ru.geekbrains.main.site.at.pages.NavigationTab;
import ru.geekbrains.main.site.at.pages.Page;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.cssSelector;

public class NavigationTest extends BaseTest {

    @Test
    public void navigationPanelTest() {
        driver.get(BASE_URL + "/career");

        PageFactory.initElements(driver, NavigationTab.class)
                .clickButton("Тесты")
                .checkHeader("Тесты")
                .getNavigationTab()
                .clickButton("Форум")
                .checkHeader("Форум");

    }

   /* WebElement testedElement; //нужно ли?

    public void checkNavigation(By byBut, By byHead, String checkHeader) {
        driver.get(BASE_URL + "/career");
        testedElement = driver.findElement(byBut);
        String header = driver.findElement(byBut).getText();
        assertEquals(checkHeader, header);
    }

    public void checkHeadFooter() {
        testedElement = driver.findElement(cssSelector("//footer"));
        assertTrue(testedElement.isDisplayed());

        testedElement = driver.findElement(cssSelector("//header"));
        assertTrue(testedElement.isDisplayed());
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void navigateTest(By byBut, By byHead, String checkedHeader) {
        checkNavigation(byBut, byHead,checkedHeader);
    }

    public static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(cssSelector("nav > a[href='/career']"), className("gb-header__title"), "Карьера"),
                Arguments.of(cssSelector("nav > a[href='/tests']"), className("gb-header__title"), "Тесты" ),
                Arguments.of(cssSelector("nav > a[href='/events']"),className("gb-header__title"), "Вебинары"),
                Arguments.of(cssSelector("nav > a[href='/topics']"), className("gb-header__title"),"Форум"),
                Arguments.of(cssSelector("nav > a[href='/posts']"), className("gb-header__title"), "Блог"),
                Arguments.of(cssSelector("nav > a[href='/courses']"), className("gb-header__title"), "Курсы")
        );
    }

    @Test
    public void careerPageTest() {
        driver.get(BASE_URL + "/career");

        WebElement careerNavItemButton = driver.findElement(cssSelector("nav > a[href='/career']"));

        String header = driver.findElement(className("gb-header__title")).getText();
        assertEquals("Карьера", header);

        boolean headerCareer = driver.findElement(className("gb-header__content")).isDisplayed();
        boolean footerCareer = driver.findElement(className("site-footer__icons")).isDisplayed();
        assertTrue(headerCareer);
        assertTrue(footerCareer);
    }

    @Test
    public void testsPageTest() {
        driver.get(BASE_URL + "/tests");

        String header = driver.findElement(className("gb-header__title")).getText();
        assertEquals("Тесты", header);

        boolean headerTests = driver.findElement(className("gb-header__content")).isDisplayed();
        boolean footerTests = driver.findElement(className("site-footer__icons")).isDisplayed();
        assertTrue(headerTests);
        assertTrue(footerTests);
    }



    @Test
    public void coursesPageTest() {
        driver.get(BASE_URL + "/courses");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//div/div/button[*]")).click();

        header = driver.findElement(className("gb-header__title")).getText();
        assertEquals("Курсы", header);

        boolean headerCourses = driver.findElement(className("gb-header__content")).isDisplayed();
        boolean footerCourses = driver.findElement(className("site-footer__icons")).isDisplayed();
        assertTrue(headerCourses);
        assertTrue(footerCourses);
    }

    @Test
    public void webinarPageTest() {
        driver.get(BASE_URL + "/events");

        header = driver.findElement(className("gb-header__title")).getText();
        assertEquals("Вебинары", header);

        boolean headerEvents = driver.findElement(className("gb-header__content")).isDisplayed();
        boolean footerEvents = driver.findElement(className("site-footer__icons")).isDisplayed();
        assertTrue(headerEvents);
        assertTrue(footerEvents);
    }

    @Test
    public void forumPageTest() {
        driver.get(BASE_URL + "/topics");

        header = driver.findElement(className("gb-header__title")).getText();

        assertEquals("Форум", header);

        boolean headerForum = driver.findElement(className("gb-header__content")).isDisplayed();
        boolean footerForum = driver.findElement(className("site-footer__icons")).isDisplayed();
        assertTrue(headerForum);
        assertTrue(footerForum);
    }

    @Test
    public void blogPageTest() {
        driver.get(BASE_URL + "/posts");

        header = driver.findElement(className("gb-header__title")).getText();
        assertEquals("Блог", header);

        boolean headerBlog = driver.findElement(className("gb-header__content")).isDisplayed();
        boolean footerBlog = driver.findElement(className("site-footer__icons")).isDisplayed();
        assertTrue(headerBlog);
        assertTrue(footerBlog);
    }  */
}
