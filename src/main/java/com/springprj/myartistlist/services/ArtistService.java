package com.springprj.myartistlist.services;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.Artist;
import com.springprj.myartistlist.models.ArtistDetail;
import com.springprj.myartistlist.repositories.ArtistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    private CounterService counterService;

    public List<Artist> getAllArtist() {

        return artistRepository.findAll();
    }

    public List<ArtistDetail> getById(long id) {
        return artistRepository.findArtistDetailByID(id);
    }

    public List<Artist> getByName(String name) {
        return artistRepository.findByName(name);
    }

    public Artist InsertArtist(Artist artist) {

        artist.setId(counterService.getNextSequence("Artist"));
        return artistRepository.save(artist);
    }

    public Optional<Artist> UpdateArtist(long id, Artist artist) {
        return null;
    }

    public Optional<Artist> DeleteArtist(long id) {
        return null;
    }

    public List<Artist> getSampleArtist() {
        return List.of(new Artist(1, "aa", List.of(), 8, List.of(), List.of()),
                new Artist(1, "aa", List.of("aa", "v"), 9, List.of("aa", "v"), List.of()));
    }
}
