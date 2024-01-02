package org.canyonsdistrict.hhs.chapter9;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Question question = new Question("What's the meaning of life?", "42");

        askQuestionAndCheckAnswer(question, in);

        ChoiceQuestion question2 = new ChoiceQuestion("Which of the following was a US president?", "Obama");
        question2.addChoice("Lucas", false);
        question2.addChoice("Me", false);
        question2.addChoice("Jack the Ripper", false);
        question2.addChoice("Obama", true);

        askQuestionAndCheckAnswer(question2, in);

    }

    private static void askQuestionAndCheckAnswer(Question question, Scanner in) {
        System.out.print(question.getQuestion());
        System.out.print("Your answer: ");
        var response = in.nextLine();

        if (question.checkAnswer(response)) {
            System.out.println("You got that right!");
        }
        else {
            System.out.println("You got it wrong :(");
        }
    }

}
