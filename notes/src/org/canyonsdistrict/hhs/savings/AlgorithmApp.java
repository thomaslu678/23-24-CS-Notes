package org.canyonsdistrict.hhs.savings;

public class AlgorithmApp {

    public static void main(String[] args) {
        forLooking();
        whileLooking();

        boolean found = false;
        char ch = 'i';
        String river = "Mississippi";
        int position = 0;
        while(!found && (position < river.length())) {
            char value = river.charAt(position);
            if (value == ch) {
                found = true;
            } else {
                position++;
            }

        }

        if (!found) {
            System.out.println("The character " + ch + " is not found in the string");
        } else {
            System.out.printf("The first character %s is in position %d in the string %s", ch, position, river);
        }


    }

    private static void whileLooking() {
        int count = 0;
        String river = "Mississippi";
        int i = 0;
        while (i < river.length()) {
            if (river.charAt(i) == 'i') {
                count ++;
            }
            i++;
        }
    }

    private static void forLooking() {
        String river = "Mississippi";
        int count = 0;
        for (int i = 0; i < river.length(); i++) {
            if (river.charAt(i) == 'i') {
                count ++;
            }
        }

    }

}
