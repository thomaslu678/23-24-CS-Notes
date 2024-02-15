package org.canyonsdistrict.hhs.chapter13;

public class Evaluator {

    public ExpressionTokenizer tokenizer;

    public Evaluator(String expression) {
        tokenizer = new ExpressionTokenizer(expression);
    }

    public int getExpressionValue() {
        return 0;
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
        int value;
        var peek = tokenizer.peek();
        if ("(".equals(peek)) {
            tokenizer.nextToken(); // throw away (
            value = getExpressionValue(); // recursive call
            tokenizer.nextToken();
        }
    }

}
