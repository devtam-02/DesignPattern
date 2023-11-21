package com.devTam.creation.Singleton;

public class SingleTon {
    private static SingleTon instance;
    String message;

    private SingleTon(String message){
        this.message = message;
    }

    public static synchronized SingleTon getInstance(String message) {
        if (instance == null) {
            instance = new SingleTon(message);
        }
        return instance;
    }
    public void doSomething() {
        System.out.println("Message is: " + this.message);
    }
}
