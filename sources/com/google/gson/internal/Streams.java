package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public final class Streams {
    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read2(jsonReader);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return JsonNull.INSTANCE;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e11) {
                throw new JsonSyntaxException(e11);
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            } catch (NumberFormatException e13) {
                throw new JsonSyntaxException(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    private static final class AppendableWriter extends Writer implements AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Appendable f33589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CurrentWrite f33590c = new CurrentWrite();

        private static class CurrentWrite implements CharSequence {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private char[] f33591b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f33592c;

            private CurrentWrite() {
            }

            void a(char[] cArr) {
                this.f33591b = cArr;
                this.f33592c = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f33591b[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f33591b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f33591b, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f33592c == null) {
                    this.f33592c = new String(this.f33591b);
                }
                return this.f33592c;
            }
        }

        AppendableWriter(Appendable appendable) {
            this.f33589b = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f33590c.a(cArr);
            this.f33589b.append(this.f33590c, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f33589b.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f33589b.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f33589b.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f33589b.append(str, i10, i11 + i10);
        }
    }
}
