package com.devTam.CreationalPattern.Singleton;

public class ThreadSafe {
    private static volatile ThreadSafe instance;

    public String value;

    private ThreadSafe(String value) {
        this.value = value;
    }

    public static ThreadSafe getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        ThreadSafe result = instance;
        if (result != null) {
            return result;
        }
        synchronized(ThreadSafe.class) {
            if (instance == null) {
                instance = new ThreadSafe(value);
            }
            return instance;
        }
    }
}
