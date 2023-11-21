package com.devTam.creation.Singleton;

public class MainDemo {
    public static void main(String[] args) {
        SingleTon singleton1 = SingleTon.getInstance("hehe");
        SingleTon singleton2 = SingleTon.getInstance("aloo");

        // Kiểm tra xem cả hai instance có cùng một địa chỉ không
        System.out.println("Singleton 1 hashcode: " + singleton1.hashCode());
        System.out.println("Singleton 2 hashcode: " + singleton2.hashCode());

        // Gọi phương thức của Singleton
        singleton1.doSomething();
        singleton2.doSomething();

        Thread threadFoo2 = new Thread(new ThreadFoo());
        Thread threadBar2 = new Thread(new ThreadBar());
        threadFoo2.start();
        threadBar2.start();
    }
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    static class ThreadFoo2 implements Runnable {
        @Override
        public void run() {
            ThreadSafe singleton = ThreadSafe.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar2 implements Runnable {
        @Override
        public void run() {
            ThreadSafe singleton = ThreadSafe.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
