package org.canyonsdistrict.hhs.chapter14;

import java.util.Arrays;
import java.util.Scanner;

public class SearchApp {

    public static void main(String[] args) {

        var values = ArrayUtil.randomArray(20, 100);
        System.out.println(Arrays.toString(values));
        var scanner = new Scanner(System.in);
        System.out.print("What value do you want: ");
        int searchValue = scanner.nextInt();
        int index = LinearSearcher.search(values, searchValue);
        if (index == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.printf("%d was found in position %d", searchValue, index);
        }


    }

}
