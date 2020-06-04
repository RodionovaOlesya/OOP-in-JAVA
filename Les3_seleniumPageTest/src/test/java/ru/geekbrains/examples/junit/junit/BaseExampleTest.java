package ru.geekbrains.examples.junit.junit;

import org.junit.jupiter.api.*;

@Disabled
public class BaseExampleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Итак, мы начинаем!");
    }

    @BeforeEach
    void setUp () {
        System.out.println("во-первых!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Закругляемся!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Basta!");
    }
}
