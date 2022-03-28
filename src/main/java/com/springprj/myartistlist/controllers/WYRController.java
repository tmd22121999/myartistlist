package com.springprj.myartistlist.controllers;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.WouldYouRather;
import com.springprj.myartistlist.services.WYRService;

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
@RequestMapping("/v1/wouldyourather")
@AllArgsConstructor
@CrossOrigin

public class WYRController {
    @Autowired
    private WYRService wouldyouratherService;

    // danh sach tat ca artist
    @GetMapping(value = { "", "/", "/wyr-list" })

    public List<WouldYouRather> wouldyourathers() {
        return wouldyouratherService.getAllWouldYouRather();
    }

    @GetMapping("/sample")

    public List<WouldYouRather> wouldyouratherSample() {
        return wouldyouratherService.getSampleWouldYouRather();
    }

    @GetMapping("/")
    public List<WouldYouRather> wouldyourather(@RequestParam("name") String name) {
        return wouldyouratherService.getByName(name);
    }

    @PostMapping(value = { "", "add" })
    public WouldYouRather InsertWouldYouRather(@RequestBody WouldYouRather newWouldYouRather) {
        return wouldyouratherService.InsertWouldYouRather(newWouldYouRather);
    }

    @PutMapping("/{id}")
    public Optional<WouldYouRather> UpdateWouldYouRather(@RequestBody WouldYouRather newWouldYouRather,
            @PathVariable long id) {
        return wouldyouratherService.UpdateWouldYouRather(id, newWouldYouRather);
    }

    @DeleteMapping("/{id}")
    public Optional<WouldYouRather> DeleteWouldYouRather(@PathVariable long id) {
        return wouldyouratherService.DeleteWouldYouRather(id);
    }
}
