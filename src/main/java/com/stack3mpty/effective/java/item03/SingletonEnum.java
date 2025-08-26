package com.stack3mpty.effective.java.item03;

/**
 * @author ckai
 * @date 2025/8/26 19:48
 */
public enum SingletonEnum {
    INSTANCE;

    private String value = "Default";

    public void doSomething() {
        System.out.println("do something：" + value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
