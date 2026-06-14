package com.google.gson;

import com.google.errorprone.annotations.InlineMe;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonParser {
    @Deprecated
    public JsonParser() {
    }

    public static JsonElement parseReader(Reader reader) throws JsonSyntaxException, JsonIOException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement reader2 = parseReader(jsonReader);
            if (!reader2.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return reader2;
        } catch (MalformedJsonException | NumberFormatException e10) {
            throw new JsonSyntaxException(e10);
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public static JsonElement parseString(String str) throws JsonSyntaxException {
        return parseReader(new StringReader(str));
    }

    @InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseString(json)")
    @Deprecated
    public JsonElement parse(String str) throws JsonSyntaxException {
        return parseString(str);
    }

    @InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public JsonElement parse(Reader reader) throws JsonSyntaxException, JsonIOException {
        return parseReader(reader);
    }

    @InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public JsonElement parse(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
        return parseReader(jsonReader);
    }

    public static JsonElement parseReader(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
        Strictness strictness = jsonReader.getStrictness();
        if (strictness == Strictness.LEGACY_STRICT) {
            jsonReader.setStrictness(Strictness.LENIENT);
        }
        try {
            try {
                return Streams.parse(jsonReader);
            } catch (OutOfMemoryError | StackOverflowError e10) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e10);
            }
        } finally {
            jsonReader.setStrictness(strictness);
        }
    }
}
