package ru.geekbrains.examples.junit.junit;

import org.junit.jupiter.api.*;

@Disabled
public class BeforeAfterExampleTest extends BaseExampleTest {

    @BeforeAll
    static void beforeAll1() {
        System.out.println("Дочка, мы начинаем!");
    }

    @BeforeEach
    void setUp1() {
        System.out.println("Дочка. Во-первых!");
    }

    @Test
    public void test01() {
        System.out.println("test 1");
    }

    @Test
    public void test02() {
        System.out.println("test 2");
    }

    @AfterEach
    void tearDown1() {
        System.out.println("Дочка, Закругляемся!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Дочка, Basta!");
    }
}
