package com.notes.persistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.notes.converter.ContentTypeConverter;
import com.notes.converter.DateConverter;
import com.notes.dao.NotesDao;
import com.notes.model.Note;

@Database(entities = {Note.class}, version = 1)
@TypeConverters({DateConverter.class, ContentTypeConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract NotesDao notesDao();
}
