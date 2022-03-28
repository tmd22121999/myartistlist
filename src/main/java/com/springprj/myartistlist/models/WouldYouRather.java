package com.springprj.myartistlist.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "wouldyourather")
public class WouldYouRather {
    @Id
    private long ID;
    private String Question;
    private String Answer1;
    private String Answer2;
    private int CountAnswer1;
    private int CountAnswer2;

    public WouldYouRather() {

    }

    public WouldYouRather(String question, String answer1, String answer2, int countAnswer1,
            int countAnswer2) {
        Question = question;
        Answer1 = answer1;
        Answer2 = answer2;
        CountAnswer1 = countAnswer1;
        CountAnswer2 = countAnswer2;
    }

    public Long getID() {
        return ID;
    }

    public void setID(long i) {
        ID = i;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer1() {
        return Answer1;
    }

    public void setAnswer1(String answer1) {
        Answer1 = answer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(String answer2) {
        Answer2 = answer2;
    }

    public int getCountAnswer1() {
        return CountAnswer1;
    }

    public void setCountAnswer1(int countAnswer1) {
        CountAnswer1 = countAnswer1;
    }

    public int getCountAnswer2() {
        return CountAnswer2;
    }

    public void setCountAnswer2(int countAnswer2) {
        CountAnswer2 = countAnswer2;
    }

}
