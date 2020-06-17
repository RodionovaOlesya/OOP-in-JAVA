package ru.geekbrains.examples.exceptions;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

    public static List<Object[]> objectList;
    public static void main(String[] args) {
        objectList = new ArrayList<>();
        while (true) {
            objectList.add(new Object[1000000000]);

        }
    }
}
