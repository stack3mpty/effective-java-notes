package com.stack3mpty.effective.java.item03;

/**
 * @author ckai
 * @date 2025/8/26 19:43
 */
public class SingletonLazy01 {

    private static SingletonLazy01 instance;

    private SingletonLazy01(){}

    public static synchronized SingletonLazy01 getInstance() {
        if (instance == null) {
            instance = new SingletonLazy01();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
