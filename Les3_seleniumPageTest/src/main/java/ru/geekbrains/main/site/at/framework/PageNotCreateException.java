package ru.geekbrains.main.site.at.framework;

public class PageNotCreateException extends RuntimeException {
    public PageNotCreateException() {
    }

    public PageNotCreateException(String message) {
        super(message);
    }

}