package com.spcruzaley.topic.concurrency.singletonpattern;

public class SingletonNormalClass {

    public static SingletonNormalClass singletonNormalClass;

    private SingletonNormalClass() {
    }

    public static SingletonNormalClass getInstance() {
        if(singletonNormalClass == null) {
            singletonNormalClass = new SingletonNormalClass();
        }

        return singletonNormalClass;
    }

}
