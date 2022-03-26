package com.springprj.myartistlist.controllers;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.Artist;
import com.springprj.myartistlist.models.ArtistDetail;
import com.springprj.myartistlist.services.ArtistService;

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

@CrossOrigin
@RestController
@RequestMapping("/v1/artist")
@AllArgsConstructor

public class ArtistController {
    @Autowired
    private ArtistService artistService;

    // danh sach tat ca artist
    @GetMapping(value = { "", "/", "/artist-list" })

    public List<Artist> artists() {
        return artistService.getAllArtist();
    }

    @GetMapping("/sample")

    public List<Artist> sample() {
        return artistService.getSampleArtist();
    }

    // chi tiet 1 artist
    @GetMapping("/{id}")

    public List<ArtistDetail> artist(@PathVariable long id) {
        return artistService.getById(id);
    }

    @GetMapping("/")
    public List<Artist> artist(@RequestParam("name") String name) {
        return artistService.getByName(name);
    }

    @PostMapping(value = { "", "add" })
    public Artist InsertArtist(@RequestBody Artist newArtist) {
        return artistService.InsertArtist(newArtist);
    }

    @PutMapping("/{id}")
    public Optional<Artist> UpdateArtist(@RequestBody Artist newArtist, @PathVariable long id) {
        return artistService.UpdateArtist(id, newArtist);
    }

    @DeleteMapping("/{id}")
    public Optional<Artist> DeleteArtist(@PathVariable long id) {
        return artistService.DeleteArtist(id);
    }
}