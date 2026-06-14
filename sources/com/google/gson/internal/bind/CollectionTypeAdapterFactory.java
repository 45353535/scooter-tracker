package com.google.gson.internal.bind;

import android.util.ArraySet;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConstructorConstructor f33603b;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeAdapter f33604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ObjectConstructor f33605b;

        public Adapter(TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.f33604a = typeAdapter;
            this.f33605b = objectConstructor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Collection<E> read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            ArraySet arraySet = (Collection<E>) ((Collection) this.f33605b.construct());
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arraySet.add(this.f33604a.read2(jsonReader));
            }
            jsonReader.endArray();
            return arraySet;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f33604a.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f33603b = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = GsonTypes.getCollectionElementType(type, rawType);
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, gson.getAdapter(TypeToken.get(collectionElementType)), collectionElementType), this.f33603b.get(typeToken, false));
    }
}
