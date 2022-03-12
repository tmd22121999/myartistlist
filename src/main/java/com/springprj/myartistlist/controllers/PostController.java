package com.springprj.myartistlist.controllers;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.Post;
import com.springprj.myartistlist.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController // Chỉ định HomeController là Controller
@RequestMapping("/v1/post")
@AllArgsConstructor
public class PostController {
    @Autowired
    private PostService postService;

    // danh sach tat ca artist
    @GetMapping(value = { "", "/", "/artist-list" })

    public List<Post> posts() {
        return postService.getAllPost();
    }

    @GetMapping("/sample")

    public List<Post> postSample() {
        return postService.getSamplePost();
    }

    // chi tiet 1 artist
    @GetMapping("/{id}")

    public Optional<Post> post(@PathVariable long id) {
        return postService.getById(id);
    }

    @GetMapping("/")
    public List<Post> post(@RequestParam("name") String name) {
        return postService.getByName(name);
    }

    @PostMapping(value = { "", "add" })
    public Post InsertPost(@RequestBody Post newPost) {
        return postService.InsertPost(newPost);
    }

    @PutMapping("/{id}")
    public Optional<Post> UpdatePost(@RequestBody Post newPost, @PathVariable long id) {
        return postService.UpdatePost(id, newPost);
    }

    @DeleteMapping("/{id}")
    public Optional<Post> DeletePost(@PathVariable long id) {
        return postService.DeletePost(id);
    }
}
