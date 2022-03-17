package com.springprj.myartistlist.models;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PostDetail {
    @Id
    private long id;
    private String url;
    private int score;
    private String rating;
    private List<Tag> tags;
    private List<Artist> artists;

    public PostDetail() {

    }

    public PostDetail(long id, String url, int score, String rating, List<Tag> tags, List<Artist> artists) {
        this.id = id;
        this.url = url;
        this.score = score;
        this.rating = rating;
        this.tags = tags;
        this.artists = artists;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

}
