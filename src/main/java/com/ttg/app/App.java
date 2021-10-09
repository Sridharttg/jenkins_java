package com.ttg.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World ttg jenkins try! test run";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
