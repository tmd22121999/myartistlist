package com.springprj.myartistlist.repositories;

import java.util.List;

import com.springprj.myartistlist.models.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends MongoRepository<Artist, Long> {
    @Query("{'name' : ?0 }")
    List<Artist> findByName(String name);

    @Query("{'name' : ?0 }")
    List<Artist> findByQuery(String name);
}
