package ru.geekbrains.examples.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class FileNotFoundExample {

//    public static void main(String[] args) {
//        try {
//            System.out.println("Ищем файл");
//            new FileReader(new File("/path/Java"));
//            System.out.println("Это сообщение не обработается, если будет exception");
//        } catch (FileNotFoundException e) {
//            System.out.println("catch exception");
//            e.printStackTrace();
//        } finally{
//           System.out.println("Всем спасибо, все свободны");
//        }
//    }

    public static void main(String[] args) {
        FileReaderExample reader = new FileReaderExample();
        try {
            reader.readFile("/la/la/");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
