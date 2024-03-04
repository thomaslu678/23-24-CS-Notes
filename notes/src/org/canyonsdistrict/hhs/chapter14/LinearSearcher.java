package org.canyonsdistrict.hhs.chapter14;

public class LinearSearcher {

    public static int search(int[] values, int value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                return i;
            }
        }

        return -1;

    }

}
