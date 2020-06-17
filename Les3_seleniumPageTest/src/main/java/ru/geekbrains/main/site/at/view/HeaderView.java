package ru.geekbrains.main.site.at.view;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.page.BasePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class HeaderView extends BasePage {
    //общие поля
    @FindBy(css = "[class='gb-header__title']")
    protected WebElement headerTitlePage;

    @FindBy(css = "[id='top-menu'] [class='show-search-form'] svg")
    protected WebElement buttonSearch;

    @FindBy(css = "input[class='search-panel__search-field']")
    protected WebElement inputSearch;
    //////////////////////

    //Поля только для НЕ авторизованного пользователя
    @FindBy(css = "[href='/login']")
    private WebElement singIn;

    @FindBy(css = "href='/register'")
    private WebElement registration;
    //////////////////////

    //Поля только для авторизованного пользователя
    @FindBy(css = "header [class='schedule-opener js-schedule-opener']")
    private WebElement buttonCalendar;

    @FindBy(css = "[class='js-notices-link']")
    private WebElement buttonNotify;

    @FindBy(css = "header [href='/thanks']")
    private WebElement buttonLike;

    @FindBy(css = "[id='menu-messages']")
    private WebElement buttonMessages;

    @FindBy(css = "[class='gb-top-menu__item dropdown']")
    private WebElement buttonAvatar;
    //////////////////////

    public HeaderView(WebDriver driver) {
        super(driver);
    }

    @Step("проверка что имя страницы: {exampleNamePage}")
    public void checkNamePage(String exampleNamePage) {
        wait30second.until(ExpectedConditions.textToBePresentInElement(headerTitlePage, exampleNamePage));

        String headerPageText = headerTitlePage.getText();
        assertThat(headerPageText, equalToCompressingWhiteSpace(exampleNamePage));
    }

    @Step("поиск на сайте по тексту: {exampleNamePage}")
    public SearchPage searchText(String text) {
        buttonSearch.click();
        inputSearch.sendKeys(text);
        return new SearchPage(driver);
    }
}