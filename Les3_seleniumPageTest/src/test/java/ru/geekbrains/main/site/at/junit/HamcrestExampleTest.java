package ru.geekbrains.main.site.at.junit;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTest {

    @Test
    public void test01() {
        int a = 105;
        Object object = new Object();
        Object object1 = object;
        assertThat(a, equalTo(105));
        assertThat(object, notNullValue());
        assertThat(object, sameInstance(object1));
    }

    @Test
    public void numTest() {
        int a = -2;
        int b = 40;
        int c = 99;
        double d = 1.65;
        Integer z = 100;
        assertThat(a, lessThan(2));
        assertThat(b, greaterThan(10));
        assertThat(c, lessThanOrEqualTo(100));
        assertThat(d, closeTo(2, 1));
        assertThat(z, instanceOf(Number.class));
    }

    @Test
    public void caseTest() {
        String a = "HORRAY!";
        String b = "horray!";
        assertThat(a, equalToIgnoringCase(b));
    }

    @Test
    public void allTest() {
        int a = 6;
        assertThat(a, allOf(
                lessThan(10),
                greaterThan(5),
                lessThanOrEqualTo(100)
        ));
    }

    @Test
    public void anyTest() {
        int a = 0;
        assertThat(a, anyOf(
                lessThan(-100),
                lessThanOrEqualTo(0)
        ));
    }

    @Test
    public void notAnyTest() {
        int a = 1;
        assertThat(a, not(anyOf(
                lessThan(-100),
                lessThanOrEqualTo(0)
        )));
    }

}
