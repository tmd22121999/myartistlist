package com.springprj.myartistlist.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Artist")
public class Artist {
    @Id
    private long id;
    private String name;
    private List<String> other_names;
    private long score;
    private List<String> categories;
    private List<String> other_links;

    public Artist() {
    }

    public Artist(long id, String name, List<String> other_names, long score, List<String> categories,
            List<String> other_links) {
        this.id = id;
        this.name = name;
        this.other_names = other_names;
        this.score = score;
        this.categories = categories;
        this.other_links = other_links;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void setOther_names(List<String> other_names) {
        this.other_names = other_names;
    }

    public long getScore() {
        return score;
    }

    public List<String> getOther_links() {
        return other_links;
    }

    public void setOther_links(List<String> other_links) {
        this.other_links = other_links;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public Artist(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOther_names() {
        return other_names;
    }

}
