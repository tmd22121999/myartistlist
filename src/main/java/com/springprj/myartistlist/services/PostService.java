package com.springprj.myartistlist.services;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.Post;
import com.springprj.myartistlist.models.PostDetail;
import com.springprj.myartistlist.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CounterService counterService;

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    public List<Post> getSamplePost() {
        return List.of(new Post(1,
                "https://cdn.donmai.us/sample/84/cd/__imu_senran_kagura_drawn_by_yaegashi_nan__sample-84cd4b5ea215c206ef4c26442f07026f.jpg",
                8, "sfw"),
                new Post(1,
                        "https://cdn.donmai.us/sample/d4/4e/__tamamo_and_tamamo_no_mae_fate_and_1_more_drawn_by_wisespeak__sample-d44eec9ba7b3805becc567cb50fa3bcc.jpg",
                        8, "sfw"));
    }

    public List<PostDetail> getById(long id) {
        return postRepository.findPostDetailByID(id);
    }

    public List<Post> getByName(String name) {
        return null;
    }

    public Post InsertPost(Post newPost) {
        newPost.setId(counterService.getNextSequence("Post"));
        return postRepository.save(newPost);
    }

    public Optional<Post> UpdatePost(long id, Post newPost) {
        return null;
    }

    public Optional<Post> DeletePost(long id) {
        return null;
    }

}
