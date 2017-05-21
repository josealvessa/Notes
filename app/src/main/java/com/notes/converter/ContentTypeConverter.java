package com.notes.converter;

import android.arch.persistence.room.TypeConverter;

import com.notes.model.Attachment;

public class ContentTypeConverter {

    @TypeConverter
    public static Attachment.ContentType fromInteger(Integer value) {
        return Attachment.ContentType.values()[value];
    }

    @TypeConverter
    public static Integer integerToAttachment(Attachment.ContentType type) {
        return type.ordinal();
    }
}
