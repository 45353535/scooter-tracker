package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final TypeAdapterFactory f33716b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f33717a;

    private SqlDateTypeAdapter() {
        this.f33717a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) throws IOException {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f33717a.getTimeZone();
            try {
                try {
                    date = new Date(this.f33717a.parse(strNextString).getTime());
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e10);
                }
            } finally {
                this.f33717a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f33717a.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }
}
