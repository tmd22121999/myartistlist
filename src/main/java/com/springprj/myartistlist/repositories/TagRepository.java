package com.springprj.myartistlist.repositories;

import java.util.List;

import com.springprj.myartistlist.models.Tag;
import com.springprj.myartistlist.models.TagDetail;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends MongoRepository<Tag, Long> {
    @Aggregation(pipeline = {
            "{'$match':{'_id':?0}}",
            "{'$lookup':{'from': 'Post','localField':'_id','foreignField': 'tags','as': 'posts'}}",
            //
    })
    List<TagDetail> findTagDetailByID(Long id);

}
