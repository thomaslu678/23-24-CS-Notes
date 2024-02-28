package org.canyonsdistrict.hhs.chapter14;

import java.util.Random;

public class ArrayUtil {

    private static Random generator = new Random();

    public static int[] randomArray(int length, int n) {
        var values = new int[length];
        for (int i = 0; i < length; i++) {
            values[i] = generator.nextInt(n);
        }

        return values;
    }

    public static void swap (int[] values, int first, int second) {
        var temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }

}
