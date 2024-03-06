package org.canyonsdistrict.hhs.chapter14;

public class BinarySearcher {

    public static int search(int[] values, int value) {
        return search(values, value, 0, values.length - 1);
    }

    private static int search(int[] values, int value, int low, int high) {
        if (low <= high) {
            int middle = (low + high) / 2;
            if (values[middle] == value) {
                return middle;
            }
            if (values[middle] < value) {
                return (search(values, value, middle+1, high));
            }
            else {
                return search(values, value, low, middle-1);
            }

        }
        else {
            return -1;
        }

    }

}
