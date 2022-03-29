package com.springprj.myartistlist.services;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.LeaderBoard;
import com.springprj.myartistlist.repositories.LeaderBoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LeaderBoardService {
    @Autowired
    private LeaderBoardRepository leaderboardRepository;
    @Autowired
    private CounterService counterService;

    public List<LeaderBoard> getAllLeaderBoard() {
        return leaderboardRepository.findAll();
    }

    public List<LeaderBoard> getSampleLeaderBoard() {
        return List.of(
                new LeaderBoard("ahoge", 8),
                new LeaderBoard("feet ", 9));
    }

    public List<LeaderBoard> getByName(String name) {

        return null;
    }

    public LeaderBoard InsertLeaderBoard(LeaderBoard newLeaderBoard) {
        newLeaderBoard.setId(counterService.getNextSequence("LeaderBoard"));
        return leaderboardRepository.save(newLeaderBoard);
    }

    public Optional<LeaderBoard> UpdateLeaderBoard(long id, LeaderBoard newLeaderBoard) {
        return null;
    }

    public Optional<LeaderBoard> DeleteLeaderBoard(long id) {
        return null;
    }

    public List<LeaderBoard> getHiscore() {
        return leaderboardRepository.findHiscore();
    }

}
