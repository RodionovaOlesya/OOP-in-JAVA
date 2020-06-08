package ru.geekbrains.examples.exceptions;

import java.util.ArrayList;
import java.util.List;

public class MainExceptionSampleExample {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Будем делить одно число на другое.");
        try {
            a = 0;
            b = 5 / a;
        }
            catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Упс! Деление на ноль невозможно.");
            }
        System.out.println("Завершение работы");
    }


}
