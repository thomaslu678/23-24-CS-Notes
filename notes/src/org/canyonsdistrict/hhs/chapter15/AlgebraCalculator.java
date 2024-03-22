package org.canyonsdistrict.hhs.chapter15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class AlgebraCalculator {

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        System.out.print("Enter an algebraic expression: ");
        var numberStack = new Stack<Integer>();
        var operatorStack = new Stack<String>();
        var validOperators = new HashSet<String>();
        validOperators.add("+");
        validOperators.add("-");
        validOperators.add("*");
        validOperators.add("/");


        while (in.hasNext()) {
            var input = in.next();
            if(input.equals("(")) {
                operatorStack.push("(");
            }
            else if (validOperators.contains(input)) {
                var topOperator =
            }
        }

    }

}
