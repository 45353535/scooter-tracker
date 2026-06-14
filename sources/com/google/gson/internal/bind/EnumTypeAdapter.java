package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final TypeAdapterFactory f33609d = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f33612c;

    private EnumTypeAdapter(Class cls) {
        this.f33610a = new HashMap();
        this.f33611b = new HashMap();
        this.f33612c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                SerializedName serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    strName = serializedName.value();
                    for (String str : serializedName.alternate()) {
                        this.f33610a.put(str, r42);
                    }
                }
                this.f33610a.put(strName, r42);
                this.f33611b.put(string, r42);
                this.f33612c.put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        T t10 = (T) this.f33610a.get(strNextString);
        return t10 == null ? (T) this.f33611b.get(strNextString) : t10;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        jsonWriter.value(t10 == null ? null : (String) this.f33612c.get(t10));
    }
}
