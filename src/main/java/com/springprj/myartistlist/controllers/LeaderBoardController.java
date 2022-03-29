package com.springprj.myartistlist.controllers;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.LeaderBoard;
import com.springprj.myartistlist.services.LeaderBoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/leaderboard")
@AllArgsConstructor
@CrossOrigin

public class LeaderBoardController {
    @Autowired
    private LeaderBoardService leaderboardService;

    // danh sach tat ca artist
    @GetMapping(value = { "", "/", "/leaderboard-list" })

    public List<LeaderBoard> leaderboards() {
        return leaderboardService.getAllLeaderBoard();
    }

    @GetMapping("/sample")

    public List<LeaderBoard> leaderboardSample() {
        return leaderboardService.getSampleLeaderBoard();
    }

    @GetMapping("/hiscore")

    public List<LeaderBoard> getHiscore() {
        return leaderboardService.getHiscore();
    }

    @GetMapping("/")
    public List<LeaderBoard> leaderboard(@RequestParam("name") String name) {
        return leaderboardService.getByName(name);
    }

    @PostMapping(value = { "", "add" })
    public LeaderBoard InsertLeaderBoard(@RequestBody LeaderBoard newLeaderBoard) {
        return leaderboardService.InsertLeaderBoard(newLeaderBoard);
    }

    @PutMapping("/{id}")
    public Optional<LeaderBoard> UpdateLeaderBoard(@RequestBody LeaderBoard newLeaderBoard, @PathVariable long id) {
        return leaderboardService.UpdateLeaderBoard(id, newLeaderBoard);
    }

    @DeleteMapping("/{id}")
    public Optional<LeaderBoard> DeleteLeaderBoard(@PathVariable long id) {
        return leaderboardService.DeleteLeaderBoard(id);
    }
}
