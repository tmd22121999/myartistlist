package com.springprj.myartistlist.repositories;

import java.util.List;

import com.springprj.myartistlist.models.Post;
import com.springprj.myartistlist.models.PostDetail;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, Long> {
    @Aggregation(pipeline = {
            "{'$match':{'_id':?0}}",
            "{'$lookup':{'from': 'Tag','localField':'tags','foreignField': '_id','as': 'tags'}}",
            "{'$lookup':{'from': 'Artist','localField':'artists','foreignField': '_id','as': 'artists'}}",
            //
    })
    List<PostDetail> findPostDetailByID(Long id);
}
