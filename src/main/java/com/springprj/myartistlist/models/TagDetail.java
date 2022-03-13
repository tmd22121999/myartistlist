package com.springprj.myartistlist.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "Tag")
public class TagDetail {
    @Id
    private long id;
    private String name;
    private List<String> other_names;
    private int score;
    private String category;
    private List<String> other_links;
    private List<Post> posts;

    public TagDetail() {

    }

    public TagDetail(String name, List<String> other_names, int score, String category, List<String> other_links) {
        this.name = name;
        this.other_names = other_names;
        this.score = score;
        this.category = category;
        this.other_links = other_links;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setScore(int score) {
        this.score = score;
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

    public void setOther_names(List<String> other_names) {
        this.other_names = other_names;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getOther_links() {
        return other_links;
    }

    public void setOther_links(List<String> other_links) {
        this.other_links = other_links;
    }

}
