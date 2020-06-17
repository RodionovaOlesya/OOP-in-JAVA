package ru.geekbrains.main.site.at.view;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.framework.PageNotCreateException;
import ru.geekbrains.main.site.at.page.BasePage;
import ru.geekbrains.main.site.at.page.content.ContentBasePage;
import ru.geekbrains.main.site.at.page.content.CoursePage;
import ru.geekbrains.main.site.at.page.content.HomePage;
import ru.geekbrains.main.site.at.page.content.TestsPage;

public class LeftNavigation extends BasePage {

    @FindBy(css = "[class='svg-icon icon-logo']")
    private WebElement icon;

    @FindBy(css = "[class*='main-page-hidden'] [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css = "[class*='main-page-hidden'] [href='/events']")
    private WebElement buttonEvents;

    @FindBy(css = "[class*='main-page-hidden'] [href='/topics']")
    private WebElement buttonTopics;

    @FindBy(css = "[class*='main-page-hidden'] [href='/posts']")
    private WebElement buttonPosts;

    @FindBy(css = "[class*='main-page-hidden'] [href='/tests']")
    private WebElement buttonTests;

    @FindBy(css = "[class*='main-page-hidden'] [href='/career']")
    private WebElement buttonCareer;

    public LeftNavigation(WebDriver driver) {
        super(driver);
    }

    @Step("Нажатие кнопки {nameButton}")
    public ContentBasePage clickButton(Button button) {
        ContentBasePage contentBasePage = null;

        switch (button) {
            case icon:
                icon.click();
                contentBasePage = new HomePage(driver);
                break;
            case buttonCourses:
                buttonCourses.click();
                contentBasePage = new CoursePage(driver);
                break;
            case buttonEvents:
                buttonEvents.click();
                break;
            case buttonTopics:
                buttonTopics.click();
                break;
            case buttonPosts:
                buttonPosts.click();
                break;
            case buttonTests:
                buttonTests.click();
                contentBasePage = new TestsPage(driver);
                break;
            case buttonCareer:
                buttonCareer.click();
                break;
        }

        if (null == contentBasePage) {
            throw new PageNotCreateException("Страница: " + button.getName() + " не описана!");
        }

        return contentBasePage;
    }

    public enum Button {
        icon("Главная"),
        buttonCourses("Курсы"),
        buttonEvents("Вебинары"),
        buttonTopics("Форум"),
        buttonPosts("Блог"),
        buttonTests("Тесты"),
        buttonCareer("Карьера");

        private String title;

        Button(String name) {
            this.title = name;
        }

        public String getName() {
            return title;
        }
    }
}
