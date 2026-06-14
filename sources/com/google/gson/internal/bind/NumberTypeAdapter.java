package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TypeAdapterFactory f33637b = a(ToNumberPolicy.LAZILY_PARSED_NUMBER);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ToNumberStrategy f33638a;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33640a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f33640a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33640a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33640a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(ToNumberStrategy toNumberStrategy) {
        this.f33638a = toNumberStrategy;
    }

    private static TypeAdapterFactory a(ToNumberStrategy toNumberStrategy) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.LAZILY_PARSED_NUMBER ? f33637b : a(toNumberStrategy);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Number read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i10 = AnonymousClass2.f33640a[jsonTokenPeek.ordinal()];
        if (i10 == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f33638a.readNumber(jsonReader);
        }
        throw new JsonSyntaxException("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
