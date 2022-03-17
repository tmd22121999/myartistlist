package com.springprj.myartistlist.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Post")
public class Post {
    @Id
    private long id;
    private String url;
    private int score;
    private String rating;
    private List<Long> tags;
    private List<Long> artists;

    public Post() {
    }

    public Post(long id, String url, int score, String rating) {
        this.id = id;
        this.url = url;
        this.score = score;
        this.rating = rating;
    }

    public Post(String url, int score, String rating, List<Long> tags, List<Long> artists) {
        this.url = url;
        this.score = score;
        this.rating = rating;
        this.artists = artists;
        this.tags = tags;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Long> getArtists() {
        return artists;
    }

    public void setArtists(List<Long> artists) {
        this.artists = artists;
    }

    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
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
