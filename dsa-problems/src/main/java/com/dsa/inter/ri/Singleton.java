package com.dsa.inter.ri;

public class Singleton {

    private static volatile Singleton instance; // volatile make sure the visibility of instance to latest.

    public static synchronized Singleton getInstance() {

        if (instance == null) {     // 1st check
            synchronized (Singleton.class) {
                if (instance == null) { // 2nd check
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
