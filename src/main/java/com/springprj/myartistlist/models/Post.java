package com.springprj.myartistlist.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "Post")
public class Post {
    @Id
    private long id;
    private String url;
    private int score;
    private String rating;

    public Post() {
    }

    public Post(long id, String url, int score, String rating) {
        this.id = id;
        this.url = url;
        this.score = score;
        this.rating = rating;
    }

    public Post(String url, int score, String rating) {
        this.url = url;
        this.score = score;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
