package com.springprj.myartistlist.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "TagRela")
public class TagsRela {
    private long tagID;
    private long postID;

    public TagsRela(long tagID, long postID) {
        this.tagID = tagID;
        this.postID = postID;
    }

    public long getTagID() {
        return tagID;
    }

    public void setTagID(long tagID) {
        this.tagID = tagID;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

}
