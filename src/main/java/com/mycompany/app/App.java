package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I hate Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("New change for Jenkins Hook");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
