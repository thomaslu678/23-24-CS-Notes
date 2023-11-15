package org.canyonsdistrict.hhs.savings;

public class NestedLoopApp {

    public static void main(String[] args) {

        final int MAX_VALUE = 12;

        for (int i = 0; i < MAX_VALUE; i++){
            for (int j = 0; j < MAX_VALUE; j++) {
                System.out.printf("%5d", (i+1) * (j+1));
            }
            System.out.println();
        }

    }

}
