package org.canyonsdistrict.hhs.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListApp {

    public static void main(String[] args) {

        // Use the List interface
        List<String> foods = new ArrayList<>();
        foods.add("Hamburger");
        foods.add("Hot Dog");
        foods.add("Pizza");
        foods.add("Sushi");
        System.out.printf("There are %d items in my array\n", foods.size());
        System.out.printf("The second food is %s\n", foods.get(1));
        foods.set(1, "Mango");

        for (String food : foods) {
            System.out.printf("You like %s\n", food);
        }

        for (int i = 0; i < foods.size(); i++) {
            System.out.printf("YOu like ", foods.get(i));
        }

        List<String> foods2 = foods;
        foods2.remove(0);
        System.out.printf(" %s\n", foods);
        foods2.remove("Pizza");
        System.out.printf(" %s\n", foods);

        List<String> copyFoods = new ArrayList<>(foods);
        copyFoods.add("Pizza");

        // Use wrapper classes
        ArrayList<Integer> values = new ArrayList<Integer>();

        /*

        Primitive Type -> Wrapper Classes
        byte    Byte
        boolean Boolean
        char    Character
        double  Double
        float   Float
        int     Integer
        long    Long
        short   Short

        auto boxing:

         */

        var inputValues = new ArrayList<Integer>();
        getInput(inputValues);
        System.out.printf("Entered values %s", inputValues);
        removeInput(inputValues, 5);
        System.out.printf("Entered values %s", inputValues);

    }

    private static void removeInput(List<Integer> values, int value) {
        int i = 0;
        while (i < values.size()) {
            var item = values.get(i);
            if (item < value) {
                values.remove(item);
            }
            else{
                i++;
            }
        }
    }

    private static int getLargest(List<Integer> values) {
        int largest = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) > largest) {
                largest = values.get(i);
            }
        }
        return largest;
    }

    private static void getInput(List<Integer> values) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter whole numbers or something else to quit: ");
        while (in.hasNextInt()) {
            values.add(in.nextInt());
        }



    }


}
