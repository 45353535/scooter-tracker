package com.google.gson.internal.bind;

import android.util.ArrayMap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConstructorConstructor f33631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f33632c;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeAdapter f33633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TypeAdapter f33634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ObjectConstructor f33635c;

        public Adapter(TypeAdapter<K> typeAdapter, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.f33633a = typeAdapter;
            this.f33634b = typeAdapter2;
            this.f33635c = objectConstructor;
        }

        private String a(JsonElement jsonElement) {
            if (!jsonElement.isJsonPrimitive()) {
                if (jsonElement.isJsonNull()) {
                    return "null";
                }
                throw new AssertionError();
            }
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                return String.valueOf(asJsonPrimitive.getAsNumber());
            }
            if (asJsonPrimitive.isBoolean()) {
                return Boolean.toString(asJsonPrimitive.getAsBoolean());
            }
            if (asJsonPrimitive.isString()) {
                return asJsonPrimitive.getAsString();
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Map<K, V> read2(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            ArrayMap arrayMap = (Map<K, V>) ((Map) this.f33635c.construct());
            if (jsonTokenPeek != JsonToken.BEGIN_ARRAY) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    Object obj = this.f33633a.read2(jsonReader);
                    if (arrayMap.put(obj, this.f33634b.read2(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + obj);
                    }
                }
                jsonReader.endObject();
                return arrayMap;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                Object obj2 = this.f33633a.read2(jsonReader);
                if (arrayMap.put(obj2, this.f33634b.read2(jsonReader)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + obj2);
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return arrayMap;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.f33632c) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f33634b.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                JsonElement jsonTree = this.f33633a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
            }
            if (!z10) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i10 < size) {
                    jsonWriter.name(a((JsonElement) arrayList.get(i10)));
                    this.f33634b.write(jsonWriter, arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i10 < size2) {
                jsonWriter.beginArray();
                Streams.write((JsonElement) arrayList.get(i10), jsonWriter);
                this.f33634b.write(jsonWriter, arrayList2.get(i10));
                jsonWriter.endArray();
                i10++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z10) {
        this.f33631b = constructorConstructor;
        this.f33632c = z10;
    }

    private TypeAdapter a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(TypeToken.get(type));
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = GsonTypes.getMapKeyAndValueTypes(type, rawType);
        Type type2 = mapKeyAndValueTypes[0];
        Type type3 = mapKeyAndValueTypes[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, a(gson, type2), type2), new TypeAdapterRuntimeTypeWrapper(gson, gson.getAdapter(TypeToken.get(type3)), type3), this.f33631b.get(typeToken, false));
    }
}
