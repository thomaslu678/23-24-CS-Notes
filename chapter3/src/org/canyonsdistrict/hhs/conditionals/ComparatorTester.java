package org.canyonsdistrict.hhs.conditionals;

public class ComparatorTester {

    public static void main(String[] args) {

        double value = Math.sqrt(2);
        double result = value * value - 2; //expect this to be zero

        // Value is close enough but not exact; we can use epsilon to solve this problem
        // |x - y| <= epsilon, that is good enough for us

        if (result == 0){
            System.out.println("sqrt(2) doubled - 2 is 0");
        }
        else{
            System.out.println("sqrt(2) doubled - 2 is not 0");
            System.out.println(result);
        }

        final double EPSILON = 1E-14;
        if (Math.abs(0 - result) <= EPSILON){
            System.out.println("sqrt(2) doubled - 2 is close to 0");
        }
        else{
            System.out.println("sqrt(2) doubled - 2 is not close to 0");

        }

    }

}
