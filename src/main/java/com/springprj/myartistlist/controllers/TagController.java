package com.springprj.myartistlist.controllers;

import java.util.List;
import java.util.Optional;

import com.springprj.myartistlist.models.Tag;
import com.springprj.myartistlist.models.TagDetail;
import com.springprj.myartistlist.services.TagService;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/v1/tag")
@AllArgsConstructor
public class TagController {
    @Autowired
    private TagService tagService;

    // danh sach tat ca artist
    @GetMapping(value = { "", "/", "/artist-list" })

    public List<Tag> tags() {
        return tagService.getAllTag();
    }

    @GetMapping("/sample")

    public List<Tag> tagSample() {
        return tagService.getSampleTag();
    }

    // chi tiet 1 artist
    @GetMapping("/{id}")

    public List<TagDetail> tag(@PathVariable long id) {
        return tagService.getById(id);
    }

    @GetMapping("/")
    public List<Tag> tag(@RequestParam("name") String name) {
        return tagService.getByName(name);
    }

    @PostMapping(value = { "", "add" })
    public Tag InsertTag(@RequestBody Tag newTag) {
        return tagService.InsertTag(newTag);
    }

    @PutMapping("/{id}")
    public Optional<Tag> UpdateTag(@RequestBody Tag newTag, @PathVariable long id) {
        return tagService.UpdateTag(id, newTag);
    }

    @DeleteMapping("/{id}")
    public Optional<Tag> DeleteTag(@PathVariable long id) {
        return tagService.DeleteTag(id);
    }
}
