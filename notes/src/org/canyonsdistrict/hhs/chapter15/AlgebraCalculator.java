package org.canyonsdistrict.hhs.chapter15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class AlgebraCalculator {

    static Set<String> validOperators;

    static {
        validOperators = new HashSet<>();
        validOperators.add("+");
        validOperators.add("-");
        validOperators.add("*");
        validOperators.add("/");

    }

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        System.out.print("Enter an algebraic expression: ");
        var numberStack = new Stack<Integer>();
        var operatorStack = new Stack<String>();
        var expression = in.nextLine();
        var expressionScanner =new Scanner(expression);


        while (expressionScanner.hasNext()) {
            var input = expressionScanner.next();
            if(input.equals("(")) {
                operatorStack.push("(");
            }
            else if (validOperators.contains(input)) {
                if (!operatorStack.isEmpty()) {
                    var topOperator = operatorStack.peek();
                    while ((topOperator.equals("*") || topOperator.equals("/"))
                    && (input.equals("+") || input.equals("-"))) {
                        var number1 = numberStack.pop();
                        var number2 = numberStack.pop();

                        if ("/".equals(topOperator)) {
                            numberStack.push (number1 / number2);
                        }
                        else {
                            numberStack.push (number1 * number2);
                        }

                        operatorStack.pop();
                        if (operatorStack.isEmpty()) {
                            break;
                        }

                        topOperator = operatorStack.peek();

                    }
                }
                operatorStack.push(input);
            }
            else if (")".equals(input)) {
                var topOperator = operatorStack.peek();
                while (!topOperator.equals("(")) {
                    var number1 = numberStack.pop();
                    var number2 = numberStack.pop();
                    switch (topOperator) {
                        case "*" -> numberStack.push(number1 * number2);
                        case "/" -> numberStack.push(number1 / number2);
                        case "+" -> numberStack.push(number1 + number2);
                        case "-" -> numberStack.push(number1 - number2);
                    }
                    operatorStack.pop();
                    topOperator = operatorStack.peek();
                }
                operatorStack.pop();
            }
            else {
                numberStack.push(Integer.parseInt(input));
            }
        }
        while (!operatorStack.isEmpty()) {
            var topOperator = operatorStack.pop();
            var number1 = numberStack.pop();
            var number2 = numberStack.pop();
            switch (topOperator) {
                case "*" -> numberStack.push(number1 * number2);
                case "/" -> numberStack.push(number1 / number2);
                case "+" -> numberStack.push(number1 + number2);
                case "-" -> numberStack.push(number1 - number2);
            }

        }

    }

}
