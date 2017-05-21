package com.notes;

import com.notes.model.Attachment;
import com.notes.model.Note;

import java.util.Date;

public class TestUtil {
    public static Note createNote() {
        Note defaultNote = new Note();
        defaultNote.setTitle("Default Title");
        defaultNote.setNote("Default Note");
        defaultNote.setNoteId(0);
        defaultNote.setLastUpdate(new Date());

        Attachment attachment = new Attachment();
        attachment.setId(1);
        attachment.setDescription("Default description");
        attachment.setType(Attachment.ContentType.DOCUMENT);
        defaultNote.setAttachment(attachment);

        return defaultNote;
    }
}
