package com.stack3mpty.effective.java.item01;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author stack3mpty
 * @date 2025/8/23 16:26
 */
public class Advantage01 {
    public static void main(String[] args) {
        // advantage 1: static factory method has a name.
        BigInteger bigInteger = new BigInteger(100,1, new Random(1));
        BigInteger bigIntegerPrime = BigInteger.probablePrime(100, new Random(1));
        System.out.println(bigInteger);
        System.out.println(bigIntegerPrime);
    }
}
