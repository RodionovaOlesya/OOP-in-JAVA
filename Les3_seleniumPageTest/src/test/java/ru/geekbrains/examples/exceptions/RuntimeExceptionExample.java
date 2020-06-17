package ru.geekbrains.examples.exceptions;

import static java.net.NetworkInterface.getByIndex;

public class RuntimeExceptionExample {

    public static void main(String[] args) {
//        try {
//            System.out.println(arithmeticExceptionExample(5,0));
//        } catch (ArithmeticException ex) {
//            ex.printStackTrace();
//            System.out.println("Опять пытаемся на ноль делить?");
//        }

//        int[] a = {11, 12, 13, 14, 15};
//        try {
//            System.out.println(getElementByIndex(a, 5));
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            ex.printStackTrace();
//            System.out.println("У этого массива нет элемента с таким индексом.");
//        }

//        Object object = 1;
//        try {
//            System.out.println((String) object);
//        } catch (ClassCastException ex) {
//            ex.printStackTrace();
//            System.out.println("Для приведения типов используй .toString()");
//        }

//        Object o = null;
//        try {
//            System.out.println(o.hashCode());
//        } catch (NullPointerException ex) {
//            ex.printStackTrace();
//            System.out.println("Хэш-кода нет, объект равен null");
//        }

//        String name = "Парамарибо";
//        try{
//            System.out.println(name.charAt(11));
//        } catch (StringIndexOutOfBoundsException ex) {
//            ex.printStackTrace();
//            System.out.println("Запрашиваемая буква за пределами слова.");
//        }

        try {
            char a = getByIndex(12);
        } catch (StringIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
        public static char getByIndex(int index) {
            return "Парамарибо".charAt(index);
        }

        public static double arithmeticExceptionExample ( int a, int b){
            return a / b;
        }

        public static int getElementByIndex ( int[] a, int i){
            return a[i];
        }

}
