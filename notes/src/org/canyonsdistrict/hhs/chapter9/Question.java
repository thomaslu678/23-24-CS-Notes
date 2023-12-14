package org.canyonsdistrict.hhs.chapter9;

public class Question {

    private String answer;
    private String question;

    public Question() {
        this.answer = "";
        this.question = "";
    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(this.answer);
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

}
