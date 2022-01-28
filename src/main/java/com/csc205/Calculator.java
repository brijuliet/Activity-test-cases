package com.csc205;

import java.util.Arrays;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int... b) {
        // vararg (int... b) series of individual int values that act like an array, must be last argument
        return a + Arrays.stream(b).sum();
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
