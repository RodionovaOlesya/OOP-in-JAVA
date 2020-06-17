package ru.geekbrains.main.site.at.page.auth;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.OpenUrl;
import ru.geekbrains.main.site.at.page.BasePage;
import ru.geekbrains.main.site.at.page.content.HomePage;

public class AuthPage extends BasePage implements OpenUrl {

    @FindBy(css = "[data-testid='login-email']")
    private WebElement inputLogin;

    @FindBy(css = "[data-testid='login-password']")
    private WebElement inputPassword;

    @FindBy(css = "[data-testid='login-submit'")
    private WebElement buttonSingInd;

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    @Step("авторизация с логин:{login} и пароль {password}")
    public HomePage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingInd.click();
        return new HomePage(driver);
    }

    @Override
    public AuthPage openUrl() {
        driver.get("https://geekbrains.ru/login");
        return this;
    }
}
