package com.dsa.interview.rel;

public class SingletonClass {

    private static volatile SingletonClass instance; // volatile make sure the visibility of instance to latest.

    public static synchronized SingletonClass getInstance() {

        if (instance == null) {     // 1st check
            synchronized (SingletonClass.class) {
                if (instance == null) { // 2nd check
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

}
