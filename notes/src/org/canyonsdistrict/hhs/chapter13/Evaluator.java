package org.canyonsdistrict.hhs.chapter13;

public class Evaluator {

    public ExpressionTokenizer tokenizer;

    public Evaluator(String expression) {
        tokenizer = new ExpressionTokenizer(expression);
    }

    public int getExpressionValue() {

        int value = getTermValue();
        boolean done = false;
        while (!done) {
            var peek = tokenizer.peek();
            if("+".equals(peek) || "-".equals(peek)) {
                tokenizer.nextToken();
                int value2 = getTermValue();

                if ("+".equals(peek)) {
                    value = value + value2;
                }
                else {
                    value = value - value2;
                }

            }
            else {
                done = true;
            }
        }

        return value;

    }

    public int getTermValue() {
        int value = getFactorValue();
        boolean done = false;
        while (!done) {
            var peek = tokenizer.peek();
            if("*".equals(peek) || "/".equals(peek)) {
                tokenizer.nextToken();
                var value2 = getFactorValue();
                if ("*".equals(peek)) {
                    value = value * value2;
                }
                else {
                    value = value / value2;
                }
            }
        }

        return value;
        
    }

    public int getFactorValue() {
        int value = 0;
        var peek = tokenizer.peek();
        if ("(".equals(peek)) {
            tokenizer.nextToken(); // throw away (
            value = getExpressionValue(); // recursive call
            tokenizer.nextToken();
        }

        return value;

    }

}
