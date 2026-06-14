package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.GsonTypes;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = GsonTypes.getArrayComponentType(type);
            return new ArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(arrayComponentType)), GsonTypes.getRawType(arrayComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f33601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter f33602b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f33602b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f33601a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Object read2(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f33602b.read2(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        if (!this.f33601a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f33601a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f33601a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f33602b.write(jsonWriter, Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }
}
