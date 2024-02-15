package org.canyonsdistrict.hhs.chapter13;

public class Fibonacci {

    public static long fib(int n) {
        if(n <= 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static long fibloop(int n) {
        if(n <= 1) {
            return 1;
        }

        long first = 1;
        long secondValue = 2;
        long returnValue = 0;
        for (int i = 0; i < n; i++) {
            returnValue = first + secondValue;
            first = secondValue;
            secondValue = returnValue;
        }

        return returnValue;

    }

}
