package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class NavigationTest extends BaseTest {

    @Test
    void navigationPanelTest() {
        driver.get(BASE_URL + "/career");
        String header;

        // создаем переменную типа WebElement и присваиваем ей значение - результат поиска по css селектору
        WebElement careerNavItemButton = driver.findElement(By.cssSelector("nav > a[href='/career']"));
        // кликаем по элементу
        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Карьера", header);

        // можно кликнуть на элемент без добавления его в отдельную переменную
        driver.findElement(By.cssSelector("nav > a[href='/tests']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Тесты", header);

        // можно нажимать и на иконку
        driver.findElement(By.cssSelector("nav.gb-left-menu__nav .svg-icon.icon-courses")).click();
        // После нажатия на кнопку Курсы мы помним, что через какое-то время может появиться баннер со скидкой
        // В любом месте программы мы можем настроить параметры неявного ожидания
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Теперь не боимся что тест упадет
        driver.findElement(By.xpath("//div/div/button[*]")).click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Курсы", header);

        driver.findElement(By.cssSelector("nav > a[href='/events']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Вебинары", header);

        driver.findElement(By.cssSelector("nav > a[href='/topics']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Форум", header);

        driver.findElement(By.cssSelector("nav > a[href='/posts']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Блог", header);
    }
}
