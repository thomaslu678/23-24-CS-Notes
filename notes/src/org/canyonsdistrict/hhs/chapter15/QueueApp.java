package org.canyonsdistrict.hhs.chapter15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(20);

        System.out.printf("First in line is %d\n", numbers.peek());
        System.out.println(numbers);
        var item = numbers.remove();
        System.out.println(numbers);

    }

}
