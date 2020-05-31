package ru.geekbrains.main.site.at.junit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExampleTest {

    @Test
    public void testEquals() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertArrayEquals(a, b);
    }

    @Test
    public void testNull() {
        String a = null;
        String b = "Какая-то строка";
        assertNull(a);
        assertNotNull(b);
    }

    @Test
    public void testThrows () {
        List<Integer> myList = Arrays.asList(0, 1, 2);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            myList.get(100);
        });
    }

    @Test
    public void testTimeOut() {
        assertTimeout(Duration.ofMillis(500), () -> {
            sleep(300);
        });
    }
}
