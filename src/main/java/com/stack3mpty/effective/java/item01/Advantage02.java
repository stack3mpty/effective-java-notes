package com.stack3mpty.effective.java.item01;

/**
 * @author stack3mpty
 * @date 2025/8/23 16:26
 */
public class Advantage02 {
    public static void main(String[] args) {
        // advantage 2: static factory method are not required to create a new object each time they're invoked.
        System.out.println(Boolean.valueOf("true"));
    }
}
