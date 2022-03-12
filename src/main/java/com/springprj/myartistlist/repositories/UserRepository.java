package com.springprj.myartistlist.repositories;

import com.springprj.myartistlist.models.user;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<user, Long> {

    // List<user> findAll();

    public long count();
}
