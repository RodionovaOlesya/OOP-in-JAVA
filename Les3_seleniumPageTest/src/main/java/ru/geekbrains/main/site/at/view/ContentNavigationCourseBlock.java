package ru.geekbrains.main.site.at.view;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.page.BasePage;
import ru.geekbrains.main.site.at.page.content.CoursePage;

public class ContentNavigationCourseBlock extends BasePage {

    @FindBy(css = "[class*='nav nav-tabs'] [id='prof-link']")
    private WebElement buttonProfessions;

    @FindBy(css = "[class*='nav nav-tabs'] [id='free-link']")
    private WebElement buttonFreeIntensive;

    @FindBy(css = "[class*='nav nav-tabs'] [id='cour-link']")
    private WebElement buttonCourses;

    @FindBy(css = "[class*='nav nav-tabs'] [href*='https://forbusiness']")
    private WebElement buttonCompanies;

    public ContentNavigationCourseBlock(WebDriver driver) {
        super(driver);
    }

    public CoursePage clickButton(String nameButton) {
        switch (nameButton) {
            case "Профессии": {
                buttonProfessions.click();
                break;
            }
            case "Бесплатные интенсивы": {
                buttonFreeIntensive.click();
                break;
            }
            case "Курсы": {
                buttonCourses.click();
                break;
            }
            case "Компаниям": {
                buttonCompanies.click();
                break;
            }
            default: {
                throw new RuntimeException("Не найдена кнопка с именем: " + nameButton);
            }
        }

        return new CoursePage(driver);
    }
}
