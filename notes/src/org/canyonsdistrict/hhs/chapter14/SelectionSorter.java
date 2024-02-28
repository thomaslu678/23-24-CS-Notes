package org.canyonsdistrict.hhs.chapter14;

public class SelectionSorter {

    public static void sort (int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int minimumPosition = minimumPosition(values, 1);
            ArrayUtil.swap(values, i, minimumPosition);
        }
    }

    private static int minimumPosition(int[] values, int from) {
        int minimumPosition = from;
        for (int i = from+1; i < values.length; i++) {
            if (values[i] < values[minimumPosition]) {
                minimumPosition = 1;
            }
        }

        return minimumPosition;
    }

}
