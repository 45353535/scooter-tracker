package com.google.gson.internal.bind;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonTreeWriter extends JsonWriter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Writer f33626e = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final JsonPrimitive f33627f = new JsonPrimitive("closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JsonElement f33630d;

    public JsonTreeWriter() {
        super(f33626e);
        this.f33628b = new ArrayList();
        this.f33630d = JsonNull.INSTANCE;
    }

    private JsonElement m() {
        return (JsonElement) this.f33628b.get(r0.size() - 1);
    }

    private void n(JsonElement jsonElement) {
        if (this.f33629c != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) m()).add(this.f33629c, jsonElement);
            }
            this.f33629c = null;
            return;
        }
        if (this.f33628b.isEmpty()) {
            this.f33630d = jsonElement;
            return;
        }
        JsonElement jsonElementM = m();
        if (!(jsonElementM instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) jsonElementM).add(jsonElement);
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        n(jsonArray);
        this.f33628b.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        n(jsonObject);
        this.f33628b.add(jsonObject);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f33628b.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f33628b.add(f33627f);
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter endArray() throws IOException {
        if (this.f33628b.isEmpty() || this.f33629c != null) {
            throw new IllegalStateException();
        }
        if (!(m() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        this.f33628b.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter endObject() throws IOException {
        if (this.f33628b.isEmpty() || this.f33629c != null) {
            throw new IllegalStateException();
        }
        if (!(m() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.f33628b.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    public JsonElement get() {
        if (this.f33628b.isEmpty()) {
            return this.f33630d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f33628b);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f33628b.isEmpty() || this.f33629c != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(m() instanceof JsonObject)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f33629c = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter nullValue() throws IOException {
        n(JsonNull.INSTANCE);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        n(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(boolean z10) throws IOException {
        n(new JsonPrimitive(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        n(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(float f10) throws IOException {
        if (!isLenient() && (Float.isNaN(f10) || Float.isInfinite(f10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f10);
        }
        n(new JsonPrimitive(Float.valueOf(f10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(double d10) throws IOException {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        n(new JsonPrimitive(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(long j10) throws IOException {
        n(new JsonPrimitive(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        n(new JsonPrimitive(number));
        return this;
    }
}
