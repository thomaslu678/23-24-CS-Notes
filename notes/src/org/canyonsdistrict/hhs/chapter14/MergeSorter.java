package org.canyonsdistrict.hhs.chapter14;

public class MergeSorter {

    public void sort(int[] values) {
        if (values.length <= 1) {
            return;
        }
        int[] first = new int[values.length / 2];
        int[] second = new int[values.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = values[i];
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = values[first.length + i];
        }

        sort(first);
        sort(second);

    }

}
