package com.springprj.myartistlist.services;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.Tag;
import com.springprj.myartistlist.models.TagDetail;
import com.springprj.myartistlist.repositories.TagRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;
    @Autowired
    private CounterService counterService;

    public List<Tag> getAllTag() {
        return tagRepository.findAll();
    }

    public List<Tag> getSampleTag() {
        return List.of(
                new Tag("ahoge", List.of("toc_ngo", "ahoge"), 8, "General",
                        List.of("https://danbooru.donmai.us/posts?tags=ahoge&z=1",
                                "https://gelbooru.com/index.php?page=post&s=list&tags=ahoge")),
                new Tag("feet ", List.of("feet", "chan"), 9, "General",
                        List.of("https://danbooru.donmai.us/posts?tags=feet",
                                "https://gelbooru.com/index.php?page=post&s=list&tags=feet")));
    }

    public List<TagDetail> getById(long id) {
        return tagRepository.findTagDetailByID(id);
    }

    public List<Tag> getByName(String name) {

        return null;
    }

    public Tag InsertTag(Tag newTag) {
        newTag.setId(counterService.getNextSequence("Tag"));
        return tagRepository.save(newTag);
    }

    public Optional<Tag> UpdateTag(long id, Tag newTag) {
        return null;
    }

    public Optional<Tag> DeleteTag(long id) {
        return null;
    }

}
