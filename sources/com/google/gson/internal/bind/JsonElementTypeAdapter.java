package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final JsonElementTypeAdapter f33617a = new JsonElementTypeAdapter();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33618a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f33618a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33618a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33618a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33618a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33618a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33618a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private JsonElementTypeAdapter() {
    }

    private JsonElement a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass1.f33618a[jsonToken.ordinal()];
        if (i10 == 3) {
            return new JsonPrimitive(jsonReader.nextString());
        }
        if (i10 == 4) {
            return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
        }
        if (i10 == 5) {
            return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return JsonNull.INSTANCE;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private JsonElement b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass1.f33618a[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new JsonArray();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new JsonObject();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public JsonElement read2(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof JsonTreeReader) {
            return ((JsonTreeReader) jsonReader).m();
        }
        JsonToken jsonTokenPeek = jsonReader.peek();
        JsonElement jsonElementB = b(jsonReader, jsonTokenPeek);
        if (jsonElementB == null) {
            return a(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = jsonElementB instanceof JsonObject ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                JsonElement jsonElementB2 = b(jsonReader, jsonTokenPeek2);
                boolean z10 = jsonElementB2 != null;
                if (jsonElementB2 == null) {
                    jsonElementB2 = a(jsonReader, jsonTokenPeek2);
                }
                if (jsonElementB instanceof JsonArray) {
                    ((JsonArray) jsonElementB).add(jsonElementB2);
                } else {
                    ((JsonObject) jsonElementB).add(strNextName, jsonElementB2);
                }
                if (z10) {
                    arrayDeque.addLast(jsonElementB);
                    jsonElementB = jsonElementB2;
                }
            } else {
                if (jsonElementB instanceof JsonArray) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return jsonElementB;
                }
                jsonElementB = (JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            jsonWriter.nullValue();
            return;
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                jsonWriter.value(asJsonPrimitive.getAsNumber());
                return;
            } else if (asJsonPrimitive.isBoolean()) {
                jsonWriter.value(asJsonPrimitive.getAsBoolean());
                return;
            } else {
                jsonWriter.value(asJsonPrimitive.getAsString());
                return;
            }
        }
        if (jsonElement.isJsonArray()) {
            jsonWriter.beginArray();
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!jsonElement.isJsonObject()) {
            throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            jsonWriter.name(entry.getKey());
            write(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }
}
