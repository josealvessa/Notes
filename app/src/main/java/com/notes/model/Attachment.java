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
}
