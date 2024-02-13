package org.canyonsdistrict.hhs.chapter13;

public class Palindrome {


    public static boolean isPalindrome(String text) {
        return isPalindrome(text, 0, text.length() - 1);
    }

    private static boolean isPalindrome(String text, int start, int end) {
        if (text.length() <= 1) {
            return true;
        }
        var first = Character.toLowerCase(text.charAt(start));
        var last = Character.toLowerCase(text.charAt(end));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                return isPalindrome(text, start + 1, end - 1);
            }
            else {
                return false;
            }
        }
        else if (!Character.isLetter(last)) {
            return isPalindrome(text, start, end - 1);
        }
        else {
            return isPalindrome(text, start + 1, end);
        }

    }


}
