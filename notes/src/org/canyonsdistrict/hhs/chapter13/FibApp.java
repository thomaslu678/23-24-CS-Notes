package org.canyonsdistrict.hhs.chapter13;

public class FibApp {

    public static void main(String[] args) {

        var value = Fibonacci.fib(50);
        System.out.println(value);
        value = Fibonacci.fibloop(50);
        System.out.println(value);

    }

}
