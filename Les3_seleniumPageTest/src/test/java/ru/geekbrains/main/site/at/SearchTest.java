package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTest extends BaseTest {

    @Test
    void searchJavaTest() {
        // Открываем страницу с курсами
        driver.get(BASE_URL + "/courses");
        // Закрываем баннер
        driver.findElement(By.xpath("//div/div/button[*]")).click();

        WebElement searchButton = driver.findElement(By.cssSelector("ul > li > .show-search-form"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
        searchInput.sendKeys("java");
        // В после отправки поискового запроса, нужно дождаться прогрузки страницы.
        // Попробуем использовать явные ожидания. Будем ждать до тех пор, пока панель, на которой расположены
        //  нужные нам элементы не будет прогружена.

        // Создаем экземпляр класса WebDriverWait, в конструктор передаем текущий экземпляр драйвера
        // и количество секунд, которое нужно ждать.
        WebDriverWait wait = new WebDriverWait(driver, 15);
        // передаем в него условие - ждать до тех пор, пока элемент с указанным CSS селектором не появится на экране
        // если ожидание затянется более чем на 15 секунд - тест упадет.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));

        // Мы нашли первую интересующую нас плашку.
        WebElement professionsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions']"));
        // Давайте проверим, что она видна пользователю.
        Assertions.assertTrue(professionsTab.isDisplayed());

        String numProf = driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='professions'] > span")).getText();
        int i = Integer.parseInt(numProf);
        Assertions.assertFalse(i<2); // тут тест падает, как поправить???

        // С остальными элементами поступим по аналогии
        WebElement coursesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses']"));
        Assertions.assertTrue(coursesTab.isDisplayed());
        driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='courses'] > span")).getText();


        WebElement webinarsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars']"));
        Assertions.assertTrue(webinarsTab.isDisplayed());
        driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='webinars'] > span")).getText();

        WebElement blogsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs']"));
        Assertions.assertTrue(blogsTab.isDisplayed());
        driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='blogs'] > span")).getText();

        WebElement forumsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums']"));
        Assertions.assertTrue(forumsTab.isDisplayed());
        driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='forums'] > span")).getText();

        WebElement testsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests']"));
        Assertions.assertTrue(testsTab.isDisplayed());
        driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='tests'] > span")).getText();


        WebElement companiesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='companies']"));
        Assertions.assertTrue(companiesTab.isDisplayed());
        driver.findElement(By.cssSelector("ul.search-page-tabs a[data-tab='compsnies'] > span")).getText();


    }
}
