package com.springprj.myartistlist.repositories;

import com.springprj.myartistlist.models.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, Long> {

}
