package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import j$.util.Objects;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    public static final TypeAdapterFactory DEFAULT_STYLE_FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            int i10 = 2;
            return new DefaultDateTypeAdapter(DateType.DATE, i10, i10);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateType f33606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33607b;

    public static abstract class DateType<T extends Date> {
        public static final DateType<Date> DATE = new DateType<Date>(Date.class) { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.1
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
            protected Date b(Date date) {
                return date;
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f33608a;

        protected DateType(Class cls) {
            this.f33608a = cls;
        }

        private TypeAdapterFactory a(DefaultDateTypeAdapter defaultDateTypeAdapter) {
            return TypeAdapters.newFactory(this.f33608a, defaultDateTypeAdapter);
        }

        protected abstract Date b(Date date);

        public final TypeAdapterFactory createAdapterFactory(String str) {
            return a(new DefaultDateTypeAdapter(this, str));
        }

        public final TypeAdapterFactory createAdapterFactory(int i10, int i11) {
            return a(new DefaultDateTypeAdapter(this, i10, i11));
        }
    }

    private Date a(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        synchronized (this.f33607b) {
            try {
                for (DateFormat dateFormat : this.f33607b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            return dateFormat.parse(strNextString);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return ISO8601Utils.parse(strNextString, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as Date; at path " + jsonReader.getPreviousPath(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f33607b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return (T) this.f33606a.b(a(jsonReader));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f33607b.get(0);
        synchronized (this.f33607b) {
            str = dateFormat.format(date);
        }
        jsonWriter.value(str);
    }

    private DefaultDateTypeAdapter(DateType dateType, String str) {
        ArrayList arrayList = new ArrayList();
        this.f33607b = arrayList;
        Objects.requireNonNull(dateType);
        this.f33606a = dateType;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(DateType dateType, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f33607b = arrayList;
        Objects.requireNonNull(dateType);
        this.f33606a = dateType;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUsDateTimeFormat(i10, i11));
        }
    }
}
