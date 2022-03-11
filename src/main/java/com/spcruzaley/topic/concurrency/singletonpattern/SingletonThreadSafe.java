package com.spcruzaley.topic.concurrency.singletonpattern;

public class SingletonThreadSafe {

    public static volatile SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        if(singletonThreadSafe != null) {
            return singletonThreadSafe;
        }
        synchronized(SingletonThreadSafe.class) {
            if (singletonThreadSafe == null) {
                singletonThreadSafe = new SingletonThreadSafe();
            }

            return singletonThreadSafe;
        }
    }
}
