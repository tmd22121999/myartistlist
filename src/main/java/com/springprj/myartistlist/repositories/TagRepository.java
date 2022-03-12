package com.springprj.myartistlist.repositories;

import com.springprj.myartistlist.models.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends MongoRepository<Tag, Long> {

}
