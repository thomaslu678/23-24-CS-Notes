package org.canyonsdistrict.hhs.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<String> permutate(String text) {
        var returnWords = new ArrayList<String>();

        if (text.length() == 0) {
            returnWords.add(text);
            return returnWords;
        }

        for (int i = 0; i < text.length(); i++) {
            var shorterText = text.substring(0, i) + text.substring(i+1);
            var shorterWords = permutate(shorterText);
            for (var s: shorterWords) {
                returnWords.add(text.charAt(i) + s);
            }
        }

        return returnWords;

    }

}
