package com.stack3mpty.effective.java.Item04;

/**
 * @author ckai
 * @date 2025/9/1 20:17
 */
public class Noninstantiability {
    private Noninstantiability() {
        // enforce noninstantiability
        throw new AssertionError();
    }

    public static void hello() {
        System.out.println("hello world");
    }
}
