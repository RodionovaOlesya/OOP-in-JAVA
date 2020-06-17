package ru.geekbrains.main.site.at.view;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.page.BasePage;

import static org.hamcrest.MatcherAssert.assertThat;


public class SearchTabsView extends BasePage {

    @FindBy(css = "[class='search-page-tabs'] [data-tab='all']")
    private WebElement tabEveryWhere;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='professions']")
    private WebElement tabProfessions;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='courses']")
    private WebElement tabCourses;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='webinars']")
    private WebElement tabWebinars;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='blogs']")
    private WebElement tabBlogs;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='forums']")
    private WebElement tabForums;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='tests']")
    private WebElement tabTests;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='companies']")
    private WebElement tabCompanies;

    public SearchTabsView(WebDriver driver) {
        super(driver);
    }

    public void clickButton(Tab tab) {
        getButton(tab).click();
    }

    public SearchTabsView checkCount(Tab tab, Matcher<Integer> matcher) {
        String actualCount = getButton(tab).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }

    private WebElement getButton(Tab tab) {
        switch (tab) {
            case Everywhere:
                return tabEveryWhere;
            case Professions:
                return tabProfessions;
            case Courses:
                return tabCourses;
            case Webinars:
                return tabWebinars;
            case Blogs:
                return tabBlogs;
            case Forums:
                return tabForums;
            case Tests:
                return tabTests;
            case Companies:
                return tabCompanies;
            default:
                throw new IllegalStateException("Unexpected value: " + tab);
        }
    }

    public enum Tab {
        Everywhere("Везде"),
        Professions("Профессии"),
        Courses("Курсы"),
        Webinars("Вебинары"),
        Blogs("Блоги"),
        Forums("Форумы"),
        Tests("Тесты"),
        Companies("Компании");

        private String text;

        Tab(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
