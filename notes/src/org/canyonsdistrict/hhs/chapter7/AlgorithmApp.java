package org.canyonsdistrict.hhs.chapter7;

import java.util.Random;

public class AlgorithmApp {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[] values = new int[20];
        fillArray(values);
        // printArray(values, ' ', );

        var sum = getSum(values);
        System.out.printf("The sum is %d\n", sum);

        var average = sum / values.length;
        System.out.printf("The average is %d\n", average);

        var min = findMin(values);
        System.out.printf("The min is %d\n", min);

        var max = findMax(values);
        System.out.printf("The max is %d\n", max);

        var position = findValue(values, 3);
        System.out.printf("Value is in position %d\n", position);

        var count = removeElement(values, 3, values.length);
        printArray(values, ' ', count);

        count = removeElement(values, 4, values.length);
        printArray(values, ' ', count);

        swap(values, 0, count - 1);
        printArray(values, ' ', count);

        int[] values2 = new int[values.length];
        copy(values,values2, count);
        printArray(values2, ' ', count);


    }

    private static void swap(int[] values, int first, int second) {
        var temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }

    private static void copy(int[] values, int[] values2, int count) {

        for (int i = 0; i < count; i++) {
            values2[i] = values[i];
        }

    }

    private static int insertElementAtEnd(int[] values, int element, int currentSize) {
        if (currentSize < values.length) {
            currentSize++;
            values[currentSize - 1] = element;
        }
        return currentSize;
    }

    private static int insertInTheMiddleish(int[] values, int element, int currentSize, int position) {
        if (currentSize < values.length) {
            currentSize++;
            for (int i = currentSize - 1; i > position; i--) {
                values[i] = values[i - 1];
            }
            values[position] = element;
        }
        return currentSize;
    }

    private static int removeElement(int[] values, int position, int currentSize) {
        for (int i = position + 1; i < currentSize; i++) {
            values[i - 1] = values[i];
        }
        return --currentSize;
    }

    private static int findValue(int[] values, int searchValue) {
        boolean found = false;
        int position = 0;

        while(!found && position < values.length) {
            if(values[position] != searchValue) {
                position++;
            }
            else {
                found = true;
            }
        }

        return found
                ? position
                : -1;

    }

    private static int findMin(int[] values) {
        var min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    private static int findMax(int[] values) {
        var max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    private static void printArray(int[] values, char character, int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                System.out.printf("%d", values[0]);
            }
            else {
                System.out.printf("%s%d", character, values[i]);

            }
        }
        System.out.println();
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return sum;
    }

    private static void fillArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }


}
