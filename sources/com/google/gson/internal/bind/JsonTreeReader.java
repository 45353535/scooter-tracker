package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonTreeReader extends JsonReader {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Reader f33619f = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f33620g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f33621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f33623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f33624e;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33625a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f33625a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33625a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33625a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33625a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(f33619f);
        this.f33621b = new Object[32];
        this.f33622c = 0;
        this.f33623d = new String[32];
        this.f33624e = new int[32];
        q(jsonElement);
    }

    private void c(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private String getPath(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f33622c;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f33621b;
            Object obj = objArr[i10];
            if (obj instanceof JsonArray) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f33624e[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f33623d[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private String n(boolean z10) {
        c(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) o()).next();
        String str = (String) entry.getKey();
        this.f33623d[this.f33622c - 1] = z10 ? "<skipped>" : str;
        q(entry.getValue());
        return str;
    }

    private Object o() {
        return this.f33621b[this.f33622c - 1];
    }

    private Object p() {
        Object[] objArr = this.f33621b;
        int i10 = this.f33622c - 1;
        this.f33622c = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void q(Object obj) {
        int i10 = this.f33622c;
        Object[] objArr = this.f33621b;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f33621b = Arrays.copyOf(objArr, i11);
            this.f33624e = Arrays.copyOf(this.f33624e, i11);
            this.f33623d = (String[]) Arrays.copyOf(this.f33623d, i11);
        }
        Object[] objArr2 = this.f33621b;
        int i12 = this.f33622c;
        this.f33622c = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        c(JsonToken.BEGIN_ARRAY);
        q(((JsonArray) o()).iterator());
        this.f33624e[this.f33622c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        c(JsonToken.BEGIN_OBJECT);
        q(((JsonObject) o()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33621b = new Object[]{f33620g};
        this.f33622c = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        c(JsonToken.END_ARRAY);
        p();
        p();
        int i10 = this.f33622c;
        if (i10 > 0) {
            int[] iArr = this.f33624e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        c(JsonToken.END_OBJECT);
        this.f33623d[this.f33622c - 1] = null;
        p();
        p();
        int i10 = this.f33622c;
        if (i10 > 0) {
            int[] iArr = this.f33624e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    JsonElement m() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) o();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        c(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) p()).getAsBoolean();
        int i10 = this.f33622c;
        if (i10 > 0) {
            int[] iArr = this.f33624e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double asDouble = ((JsonPrimitive) o()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        p();
        int i10 = this.f33622c;
        if (i10 > 0) {
            int[] iArr = this.f33624e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int asInt = ((JsonPrimitive) o()).getAsInt();
        p();
        int i10 = this.f33622c;
        if (i10 > 0) {
            int[] iArr = this.f33624e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long asLong = ((JsonPrimitive) o()).getAsLong();
        p();
        int i10 = this.f33622c;
        if (i10 > 0) {
            int[] iArr = this.f33624e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return n(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        c(JsonToken.NULL);
        p();
        int i10 = this.f33622c;
        if (i10 > 0) {
            int[] iArr = this.f33624e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek == jsonToken || jsonTokenPeek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) p()).getAsString();
            int i10 = this.f33622c;
            if (i10 > 0) {
                int[] iArr = this.f33624e;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f33622c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objO = o();
        if (objO instanceof Iterator) {
            boolean z10 = this.f33621b[this.f33622c - 2] instanceof JsonObject;
            Iterator it = (Iterator) objO;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z10) {
                return JsonToken.NAME;
            }
            q(it.next());
            return peek();
        }
        if (objO instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objO instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objO instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) objO;
            if (jsonPrimitive.isString()) {
                return JsonToken.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objO instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (objO == f33620g) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objO.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() throws IOException {
        c(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) o()).next();
        q(entry.getValue());
        q(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i10 = AnonymousClass2.f33625a[peek().ordinal()];
        if (i10 == 1) {
            n(true);
            return;
        }
        if (i10 == 2) {
            endArray();
            return;
        }
        if (i10 == 3) {
            endObject();
            return;
        }
        if (i10 != 4) {
            p();
            int i11 = this.f33622c;
            if (i11 > 0) {
                int[] iArr = this.f33624e;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return JsonTreeReader.class.getSimpleName() + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
