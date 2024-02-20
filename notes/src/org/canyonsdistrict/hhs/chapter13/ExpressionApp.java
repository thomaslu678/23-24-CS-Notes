package org.canyonsdistrict.hhs.chapter13;

public class ExpressionApp {

    public static void main(String[] args) {

        var expression = "3*9+(7-2)";
        var evaluator = new Evaluator(expression);

        System.out.println(expression + "=" + evaluator.getExpressionValue());

    }

}
