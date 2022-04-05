package com.springprj.myartistlist.services;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.WouldYouRather;
import com.springprj.myartistlist.repositories.WYRRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class WYRService {
    @Autowired
    private WYRRepository wyrRepository;
    @Autowired
    private CounterService counterService;

    public List<WouldYouRather> getAllWouldYouRather() {
        return wyrRepository.findAll();
    }

    public List<WouldYouRather> getSampleWouldYouRather() {
        return List.of(new WouldYouRather("abc", "cde", "egf", 1, 1));
    }

    public List<WouldYouRather> getByName(String name) {

        return null;
    }

    public WouldYouRather InsertWouldYouRather(WouldYouRather newWouldYouRather) {
        newWouldYouRather.setID(counterService.getNextSequence("WouldYouRather"));
        return wyrRepository.save(newWouldYouRather);
    }

    public WouldYouRather UpdateWouldYouRather(long id, WouldYouRather newWouldYouRather) {
        Optional<WouldYouRather> oldWYR = wyrRepository.findById(id);
        if (oldWYR.isPresent()) {
            WouldYouRather _WouldYouRather = oldWYR.get();
            _WouldYouRather.setData(newWouldYouRather);
            System.out.println(_WouldYouRather.getAnswer1());
            return wyrRepository.save(_WouldYouRather);
        } else {
            return newWouldYouRather;
        }
    }

    public Optional<WouldYouRather> DeleteWouldYouRather(long id) {
        return null;
    }

}
