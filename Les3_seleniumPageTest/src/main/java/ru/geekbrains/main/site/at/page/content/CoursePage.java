package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.view.ContentNavigationCourseBlock;

public class CoursePage extends ContentBasePage {

    private ContentNavigationCourseBlock contentNavigationCourseBlock;

    public CoursePage(WebDriver driver) {
        super(driver);
        this.contentNavigationCourseBlock = new ContentNavigationCourseBlock(driver);
    }

    public CoursePage configFilter(String... args) {
        for (String test : args) {
            driver.findElement(By.xpath("//form/ul//label[text()='" + test + "']"))
                    .click();
        }
        return this;
    }

    public CoursePage checkingDisplayedCourses(String... args) {
        for (String test : args) {
            driver.findElement(By.xpath("//a/div/div/span[text()='" + test + "']"));
        }
        return this;
    }

    public ContentNavigationCourseBlock getContentNavigationCourseBlock() {
        return contentNavigationCourseBlock;
    }

    @Override
    public CoursePage openUrl() {
        driver.get("https://geekbrains.ru/courses");
        return this;
    }
}

