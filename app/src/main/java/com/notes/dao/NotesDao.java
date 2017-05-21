package com.notes.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.notes.model.Note;

import java.util.List;

@Dao
public interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertNote(Note note);

    @Update
    public void updateNote(Note note);

    @Delete
    public void deleteNote(Note note);

    @Query("Select * from Note ")
    public Note[] getNotes();

    @Query("Select * from Note where noteId = :id")
    public Note findNoteById(int id);
}
