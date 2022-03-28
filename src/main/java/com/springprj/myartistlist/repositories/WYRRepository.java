package com.springprj.myartistlist.repositories;

import com.springprj.myartistlist.models.WouldYouRather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WYRRepository extends MongoRepository<WouldYouRather, Long> {

}
