package com.notes.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

public class Attachment {

    public enum ContentType { IMAGE, AUDIO, VIDEO, DOCUMENT };

    @PrimaryKey
    private int id;

    @ColumnInfo
    private String description;

    @ColumnInfo
    private ContentType type;

    @ColumnInfo
    private byte[] content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContentType getType() {
        return type;
    }

    public void setType(ContentType type) {
        this.type = type;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
