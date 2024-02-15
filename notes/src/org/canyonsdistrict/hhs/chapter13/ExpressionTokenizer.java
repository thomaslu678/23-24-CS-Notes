package org.canyonsdistrict.hhs.chapter13;

public class ExpressionTokenizer {

    private String input;
    private int start;
    private int end;

    public ExpressionTokenizer(String input) {
        this.input = input;
        start = 0;
        end = 0;
    }

    public String peek() {
        if (start >= input.length()) {
            return null;
        }
        return input.substring(start, end);
    }

    public String nextToken() {
        var r = peek();
        start = end;
        if (start >= input.length()) {
            return r;
        }

        if (Character.isDigit(input.charAt(start))) {
            end = start + 1;
            while (end < input.length() && Character.isDigit(end)) {
                end++;
            }
        }
        else {
            end = start + 1;
        }
        return r;

    }

}
