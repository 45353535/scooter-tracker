package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.GsonPreconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsonSerializer f33668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JsonDeserializer f33669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Gson f33670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeToken f33671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TypeAdapterFactory f33672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final GsonContextImpl f33673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile TypeAdapter f33675h;

    private final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        private GsonContextImpl() {
        }

        @Override // com.google.gson.JsonDeserializationContext
        public <R> R deserialize(JsonElement jsonElement, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.f33670c.fromJson(jsonElement, type);
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj) {
            return TreeTypeAdapter.this.f33670c.toJsonTree(obj);
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.f33670c.toJsonTree(obj, type);
        }
    }

    private static final class SingleTypeFactory implements TypeAdapterFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TypeToken f33677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f33678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Class f33679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final JsonSerializer f33680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final JsonDeserializer f33681f;

        SingleTypeFactory(Object obj, TypeToken typeToken, boolean z10, Class cls) {
            JsonSerializer jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.f33680e = jsonSerializer;
            JsonDeserializer jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
            this.f33681f = jsonDeserializer;
            GsonPreconditions.checkArgument((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.f33677b = typeToken;
            this.f33678c = z10;
            this.f33679d = cls;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken typeToken2 = this.f33677b;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f33678c && this.f33677b.getType() == typeToken.getRawType()) : this.f33679d.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.f33680e, this.f33681f, gson, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory, boolean z10) {
        this.f33673f = new GsonContextImpl();
        this.f33668a = jsonSerializer;
        this.f33669b = jsonDeserializer;
        this.f33670c = gson;
        this.f33671d = typeToken;
        this.f33672e = typeAdapterFactory;
        this.f33674g = z10;
    }

    private TypeAdapter a() {
        TypeAdapter typeAdapter = this.f33675h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.f33670c.getDelegateAdapter(this.f33672e, this.f33671d);
        this.f33675h = delegateAdapter;
        return delegateAdapter;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter<T> getSerializationDelegate() {
        return this.f33668a != null ? this : a();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        if (this.f33669b == null) {
            return (T) a().read2(jsonReader);
        }
        JsonElement jsonElement = Streams.parse(jsonReader);
        if (this.f33674g && jsonElement.isJsonNull()) {
            return null;
        }
        return (T) this.f33669b.deserialize(jsonElement, this.f33671d.getType(), this.f33673f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        JsonSerializer jsonSerializer = this.f33668a;
        if (jsonSerializer == null) {
            a().write(jsonWriter, t10);
        } else if (this.f33674g && t10 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(jsonSerializer.serialize(t10, this.f33671d.getType(), this.f33673f), jsonWriter);
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
    }
}
