package com.springprj.myartistlist.repositories;

import java.util.List;

import com.springprj.myartistlist.models.Artist;
import com.springprj.myartistlist.models.ArtistDetail;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends MongoRepository<Artist, Long> {
    @Query("{'name' : ?0 }")
    List<Artist> findByName(String name);

    @Query("{'name' : ?0 }")
    List<Artist> findByQuery(String name);

    @Aggregation(pipeline = {
            "{'$match':{'_id':?0}}",
            "{'$lookup':{'from': 'Post','localField':'_id','foreignField': 'artists','as': 'posts'}}",
            //
    })
    List<ArtistDetail> findArtistDetailByID(Long id);
}
