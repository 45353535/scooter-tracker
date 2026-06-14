package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final TypeAdapterFactory f33613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TypeAdapterFactory f33614e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConstructorConstructor f33615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f33616c = new ConcurrentHashMap();

    private static class DummyTypeAdapterFactory implements TypeAdapterFactory {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f33613d = new DummyTypeAdapterFactory();
        f33614e = new DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f33615b = constructorConstructor;
    }

    private static Object a(ConstructorConstructor constructorConstructor, Class cls) {
        return constructorConstructor.get(TypeToken.get(cls), true).construct();
    }

    private static JsonAdapter b(Class cls) {
        return (JsonAdapter) cls.getAnnotation(JsonAdapter.class);
    }

    private TypeAdapterFactory d(Class cls, TypeAdapterFactory typeAdapterFactory) {
        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) this.f33616c.putIfAbsent(cls, typeAdapterFactory);
        return typeAdapterFactory2 != null ? typeAdapterFactory2 : typeAdapterFactory;
    }

    TypeAdapter c(ConstructorConstructor constructorConstructor, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter, boolean z10) {
        TypeAdapter typeAdapterCreate;
        Object objA = a(constructorConstructor, jsonAdapter.value());
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objA instanceof TypeAdapter) {
            typeAdapterCreate = (TypeAdapter) objA;
        } else if (objA instanceof TypeAdapterFactory) {
            TypeAdapterFactory typeAdapterFactoryD = (TypeAdapterFactory) objA;
            if (z10) {
                typeAdapterFactoryD = d(typeToken.getRawType(), typeAdapterFactoryD);
            }
            typeAdapterCreate = typeAdapterFactoryD.create(gson, typeToken);
        } else {
            boolean z11 = objA instanceof JsonSerializer;
            if (!z11 && !(objA instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z11 ? (JsonSerializer) objA : null, objA instanceof JsonDeserializer ? (JsonDeserializer) objA : null, gson, typeToken, z10 ? f33613d : f33614e, zNullSafe);
            zNullSafe = false;
            typeAdapterCreate = treeTypeAdapter;
        }
        return (typeAdapterCreate == null || !zNullSafe) ? typeAdapterCreate : typeAdapterCreate.nullSafe();
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapterB = b(typeToken.getRawType());
        if (jsonAdapterB == null) {
            return null;
        }
        return c(this.f33615b, gson, typeToken, jsonAdapterB, true);
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(typeAdapterFactory);
        if (typeAdapterFactory == f33613d) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) this.f33616c.get(rawType);
        if (typeAdapterFactory2 != null) {
            return typeAdapterFactory2 == typeAdapterFactory;
        }
        JsonAdapter jsonAdapterB = b(rawType);
        if (jsonAdapterB == null) {
            return false;
        }
        Class<?> clsValue = jsonAdapterB.value();
        return TypeAdapterFactory.class.isAssignableFrom(clsValue) && d(rawType, (TypeAdapterFactory) a(this.f33615b, clsValue)) == typeAdapterFactory;
    }
}
