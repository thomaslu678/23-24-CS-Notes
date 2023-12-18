package org.canyonsdistrict.hhs.chapter9;

public class Question {

    // Can be seen if in the same package / inheritance hierarchy
    protected String answer;
    private String question;

    public Question() {
        this.answer = "";
        this.question = "";
    }

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;

    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(this.answer);
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public String getQuestion() {
        return question;
    }

}
