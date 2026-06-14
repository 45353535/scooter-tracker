package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes9.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f33682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter f33683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f33684c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f33682a = gson;
        this.f33683b = typeAdapter;
        this.f33684c = type;
    }

    private static Type a(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean b(TypeAdapter typeAdapter) {
        TypeAdapter<T> serializationDelegate;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) typeAdapter).getSerializationDelegate()) != typeAdapter) {
            typeAdapter = serializationDelegate;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        return (T) this.f33683b.read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        TypeAdapter<T> adapter = this.f33683b;
        Type typeA = a(this.f33684c, t10);
        if (typeA != this.f33684c) {
            adapter = this.f33682a.getAdapter(TypeToken.get(typeA));
            if ((adapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !b(this.f33683b)) {
                adapter = this.f33683b;
            }
        }
        adapter.write(jsonWriter, t10);
    }
}
