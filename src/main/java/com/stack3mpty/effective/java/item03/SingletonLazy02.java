package com.stack3mpty.effective.java.item03;

/**
 * @author ckai
 * @date 2025/8/26 19:44
 */
public class SingletonLazy02 {

    private static volatile SingletonLazy02 instance;

    private SingletonLazy02(){}

    private static SingletonLazy02 getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy02.class) {
                if (instance == null) {
                    instance = new SingletonLazy02();
                }
            }
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
