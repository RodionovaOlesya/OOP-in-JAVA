package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {

    @Test
    void searchJavaTest() {
        driver.get(BASE_URL + "/courses");
        //driver.findElement(By.xpath("//div/div/button[*]")).click();

        WebElement searchButton = driver.findElement(By.cssSelector("ul > li > .show-search-form"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
        searchInput.sendKeys("java");

        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));

        WebElement professionsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions']"));
        Assertions.assertTrue(professionsTab.isDisplayed());

        String numProf = driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='professions'] > span")).getText();
        int numP = Integer.parseInt(numProf);
        assertThat(numP, greaterThanOrEqualTo(2));

        WebElement coursesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses']"));
        Assertions.assertTrue(coursesTab.isDisplayed());
        String numCourses = driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='courses'] > span")).getText();
        int numC = Integer.parseInt(numCourses);
        assertThat(numC, greaterThan(15));

        WebElement webinarsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars']"));
        Assertions.assertTrue(webinarsTab.isDisplayed());
        String numWebinars = driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='webinars'] > span")).getText();
        int numW = Integer.parseInt(numWebinars);
        assertThat(numW, allOf(
                greaterThan(180),
                lessThan(300)
        ));

        WebElement blogsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs']"));
        Assertions.assertTrue(blogsTab.isDisplayed());
        String numBlogs = driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='blogs'] > span")).getText();
        int numB = Integer.parseInt(numBlogs);
        assertThat(numB, greaterThan(300));

        WebElement forumsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums']"));
        Assertions.assertTrue(forumsTab.isDisplayed());
        String numForums = driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='forums'] > span")).getText();
        int numF = Integer.parseInt(numForums);
        assertThat(numF, not(350));
        //Assertions.assertTrue(numF != 350);

        WebElement testsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests']"));
        Assertions.assertTrue(testsTab.isDisplayed());
        String numTests = driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='tests'] > span")).getText();
        int numT = Integer.parseInt(numForums);
        assertThat(numT, not(0));

        WebElement companiesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='companies']"));
        Assertions.assertTrue(companiesTab.isDisplayed());
    }
}
