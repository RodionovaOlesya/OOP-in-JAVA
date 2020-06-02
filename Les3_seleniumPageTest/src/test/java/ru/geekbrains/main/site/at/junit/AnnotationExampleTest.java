package ru.geekbrains.main.site.at.junit;

import org.junit.jupiter.api.*;

import java.util.Random;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnnotationExampleTest {

    @Disabled
    @Test
    public void test01(){
        assertTrue(true);
    }

    @DisplayName("Проверка на честность")
    @Test
    public void test02(){
        assertTrue(true);
    }

    @DisplayName("Проверка везения")
    @RepeatedTest(10)
    @Test
    public void test03(){
        int x = new Random().nextInt(100);
        assertTrue(x > 50);
    }

   /* @Test
    @Timeout(1)
    public void test04() {
        sleep(1100);
        assertTrue(true);

    } */
}
