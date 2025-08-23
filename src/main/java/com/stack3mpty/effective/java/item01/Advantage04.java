package com.stack3mpty.effective.java.item01;

import java.util.EnumSet;

/**
 * @author stack3mpty
 * @date 2025/8/23 16:27
 */
public class Advantage04 {
    public static void main(String[] args) {
        // advantage 4: The class of the returned object can vary from call to call as a function of the input parameters.
        //Enum has ≤ 64 constants ? RegularEnumSet : JumboEnumSet
        EnumSet<Color> set = EnumSet.of(Color.RED, Color.BLUE);
        System.out.println(set);
    }
    private enum Color {
        RED,
        BLUE
    }
}
