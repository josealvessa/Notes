package com.notes.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(indices = {@Index("title")})
public class Note {

    @PrimaryKey
    private int id;

    @ColumnInfo
    private String title;

    @ColumnInfo
    private String note;

    @ColumnInfo
    private Date lastUpdate;

    @Embedded
    private Attachment attachment;
}
