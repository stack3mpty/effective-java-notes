package com.stack3mpty.effective.java.item03;

/**
 * @author ckai
 * @date 2025/8/26 19:35
 */
public class SingletonHungry {

    private static final SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry() {
        if (INSTANCE != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance");
        }
    }

    public static SingletonHungry getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
