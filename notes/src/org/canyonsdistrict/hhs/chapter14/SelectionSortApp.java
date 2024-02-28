package org.canyonsdistrict.hhs.chapter14;

import java.util.Arrays;

public class SelectionSortApp {

    public static void main(String[] args) {

        int[] values = ArrayUtil.randomArray(30, 100);
        System.out.println(Arrays.toString(values));
        SelectionSorter.sort(values);
        System.out.println(Arrays.toString(values));

    }

}
