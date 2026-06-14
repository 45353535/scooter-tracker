package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JsonReader f33530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f33531c;

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z10;
        synchronized (this.f33531c) {
            try {
                try {
                    try {
                        z10 = this.f33530b.peek() != JsonToken.END_DOCUMENT;
                    } catch (MalformedJsonException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                } catch (IOException e11) {
                    throw new JsonIOException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.f33530b = jsonReader;
        jsonReader.setStrictness(Strictness.LENIENT);
        this.f33531c = new Object();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return Streams.parse(this.f33530b);
        } catch (OutOfMemoryError | StackOverflowError e10) {
            throw new JsonParseException("Failed parsing JSON source to Json", e10);
        }
    }
}
