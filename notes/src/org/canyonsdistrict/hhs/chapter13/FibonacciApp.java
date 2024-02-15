package org.canyonsdistrict.hhs.chapter13;

public class FibonacciApp {

    public static void main(String[] args) {

        var text = "cat";
        var results = Permutations.permutate(text);
        for (var s: results) {
            System.out.println(s);
        }

    }

}
