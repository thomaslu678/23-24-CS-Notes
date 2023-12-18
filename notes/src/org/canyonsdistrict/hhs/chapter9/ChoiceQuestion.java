package org.canyonsdistrict.hhs.chapter9;

import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestion extends Question{

    private List<String> choices;

    public ChoiceQuestion(String question, String answer) {
        super(question, answer);
        choices = new ArrayList<>();
    }
    /*
    
    lol its the coode with me feature
    used it in coding and programming fbla

     */

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            super.setAnswer(choice);
        }
    }

    // Strings are immutable, thus string concatenation in a loop can potentially become a memory issue
    public String getQuestion() {
        var question = super.getQuestion();
        for (var choice : choices) {
            question += "\n" + choice;
        }
        return question;
    }

}
