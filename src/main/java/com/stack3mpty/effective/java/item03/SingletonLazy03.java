package com.stack3mpty.effective.java.item03;

/**
 * @author ckai
 * @date 2025/8/26 19:46
 */
public class SingletonLazy03 {

    private SingletonLazy03() {}

    private static class Holder {
        private static final SingletonLazy03 INSTANCE = new SingletonLazy03();
    }

    public static SingletonLazy03 getInstance() {
        return Holder.INSTANCE;
    }

    private Object readResolve() {
        return Holder.INSTANCE;
    }
}
