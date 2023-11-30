package org.canyonsdistrict.hhs.chapter7;

import java.util.Scanner;

public class ArrayApp {

    public static void main(String[] args) {
        // type of variable + name + assignment + initializing
        int[] grades = new int[10];
        int[] grades2 = {45, 78, 99, 65, 89, 23, 100};

        System.out.printf("Position 5 holds %d\n", grades2[4]);

        int[] grades3 = grades2;
        grades3[4] = 90;
        System.out.printf("Position 5 holds %d\n", grades2[4]);

        gradeExtractor(grades3);
        gradeExtractor(grades);
        gradeExtractor(grades2);

        var sum = 0;
        for (var grade : grades2) {

        }

    }

    private static void gradeExtractor(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }

    private static void gradeExtractor(int[] grades, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(grades[i]);
        }
    }


    private static int getGrades(int[] grades) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while(in.hasNextInt() && count < grades.length) {
            grades[count] = in.nextInt();
            count++;
        }

        return count;

    }


}
