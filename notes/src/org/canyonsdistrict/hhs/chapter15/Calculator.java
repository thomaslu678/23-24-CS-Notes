package org.canyonsdistrict.hhs.chapter15;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        var numbers = new Stack<Integer>();
        System.out.print("Enter one number or operator per line, or Q to quit: ");

        var done = false;
        while(!done) {
            var input = in.nextLine();
            if (input.equals("+")) {
                var first = numbers.pop();
                var second = numbers.pop();
                numbers.push(first + second);
            }
            else if (input.equals("-")) {
                numbers.push(numbers.pop() - numbers.pop());
            }
            else if (input.equals("*") || input.equalsIgnoreCase("x")) {
                numbers.push(numbers.pop() * numbers.pop());
            }
            else if (input.equals("/")) {
                numbers.push(numbers.pop() / numbers.pop());
            }
            else if (input.equalsIgnoreCase("q")) {
                done = true;
            }
            else {
                numbers.push(Integer.parseInt(input));
            }
        }

        System.out.println(numbers.peek());

    }

}
