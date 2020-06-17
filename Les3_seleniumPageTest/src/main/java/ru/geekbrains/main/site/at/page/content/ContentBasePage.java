package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.OpenUrl;
import ru.geekbrains.main.site.at.page.BasePage;
import ru.geekbrains.main.site.at.view.HeaderView;
import ru.geekbrains.main.site.at.view.LeftNavigation;

public abstract class ContentBasePage extends BasePage implements OpenUrl {

    protected LeftNavigation leftNavigation;
    protected HeaderView headerView;

    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
    private WebElement buttonPopUpClosed;

    public ContentBasePage(WebDriver driver) {
        super(driver);
        this.headerView = new HeaderView(driver);
        this.leftNavigation = new LeftNavigation(driver);
    }

    public ContentBasePage closedPopUp() {
        wait10second.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
        if (buttonPopUpClosed.isDisplayed()) {
            this.buttonPopUpClosed.click();
        }
        return this;
    }

    public LeftNavigation getLeftNavigation() {
        return leftNavigation;
    }

    public HeaderView getHeader() {
        return headerView;
    }

    /**
     * Адаптер над объектом HeaderBlock
     * После работы с методом HeaderBlock#checkNamePage(String) сайт остается на тойже странице
     */
    public ContentBasePage checkNamePage(String exampleNamePage) {
        headerView.checkNamePage(exampleNamePage);
        return this;
    }

}
