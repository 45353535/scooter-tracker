package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TypeAdapterFactory f33641c = a(ToNumberPolicy.DOUBLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f33642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ToNumberStrategy f33643b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33645a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f33645a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33645a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33645a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33645a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33645a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33645a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static TypeAdapterFactory a(final ToNumberStrategy toNumberStrategy) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, toNumberStrategy);
                }
                return null;
            }
        };
    }

    private Object b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass2.f33645a[jsonToken.ordinal()];
        if (i10 == 3) {
            return jsonReader.nextString();
        }
        if (i10 == 4) {
            return this.f33643b.readNumber(jsonReader);
        }
        if (i10 == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private Object c(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass2.f33645a[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new LinkedTreeMap();
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.DOUBLE ? f33641c : a(toNumberStrategy);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Object read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objC = c(jsonReader, jsonTokenPeek);
        if (objC == null) {
            return b(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objC instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Object objC2 = c(jsonReader, jsonTokenPeek2);
                boolean z10 = objC2 != null;
                if (objC2 == null) {
                    objC2 = b(jsonReader, jsonTokenPeek2);
                }
                if (objC instanceof List) {
                    ((List) objC).add(objC2);
                } else {
                    ((Map) objC).put(strNextName, objC2);
                }
                if (z10) {
                    arrayDeque.addLast(objC);
                    objC = objC2;
                }
            } else {
                if (objC instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objC;
                }
                objC = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter adapter = this.f33642a.getAdapter(obj.getClass());
        if (!(adapter instanceof ObjectTypeAdapter)) {
            adapter.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    private ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy) {
        this.f33642a = gson;
        this.f33643b = toNumberStrategy;
    }
}
