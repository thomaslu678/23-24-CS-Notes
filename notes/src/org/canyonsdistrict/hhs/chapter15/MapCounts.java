package org.canyonsdistrict.hhs.chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapCounts {

    public static void main(String[] args) throws FileNotFoundException{
        var listOfWords = readWords("doc");
        var wordCounts = new HashMap<String, Integer>();
        for(var word : listOfWords) {
            if(wordCounts.containsKey(word)) {
                var count = wordCounts.get(word);
                wordCounts.put(word, ++count);
            }
        }
        for (var word : wordCounts.entrySet()) {
            System.out.printf("%s : %d");
        }

    }

    private static List<String> readWords(String fileName) throws FileNotFoundException {
        var words = new ArrayList<String>();
        var in = new Scanner(new File(fileName));
        in.useDelimiter("[^a-zA-Z]");
        while(in.hasNext()) {
            words.add(in.next().toLowerCase());
        }
        return words;
    }

}
