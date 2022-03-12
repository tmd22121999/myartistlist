package com.springprj.myartistlist.repositories;

import com.springprj.myartistlist.models.TagsRela;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagsRelaRepository extends MongoRepository<TagsRela, Long> {

}
