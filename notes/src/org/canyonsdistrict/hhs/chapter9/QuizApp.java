package org.canyonsdistrict.hhs.chapter9;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Question question = new Question();

        question.setQuestion("What is the meaning of life?");
        question.setAnswer("42");

        System.out.print(question.getQuestion());
        System.out.print("Your answer: ");

        if (question.checkAnswer(in.next())) {
            System.out.println("You got that right!");
        }
        else {
            System.out.println("You got it wrong :(");
        }

        ChoiceQuestion question2 = new ChoiceQuestion();
        question2.setQuestion("Which of the following was a US president?");
        question2.addChoice("Lucas", false);
        question2.addChoice("Me", false);
        question2.addChoice("Jack the Ripper", false);
        question2.addChoice("Obama", true);

        System.out.println(question2.getQuestion());
        String response = in.nextLine();

        if (question2.checkAnswer(response)) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect.");
        }


    }

}
