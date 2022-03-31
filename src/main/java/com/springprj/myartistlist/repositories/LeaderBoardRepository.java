package com.springprj.myartistlist.repositories;

import java.util.List;

import com.springprj.myartistlist.models.LeaderBoard;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderBoardRepository extends MongoRepository<LeaderBoard, Long> {
    @Aggregation(pipeline = {
            "{'$sort':{'score': -1}}",
            "{$limit: 10}",
    })
    List<LeaderBoard> findHiscore();
}
