package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f33540b = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33541c = 136;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33542d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f33544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f33545g;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f33544f = list;
        this.f33545g = list;
    }

    private static boolean b(Class cls) {
        return cls.isMemberClass() && !ReflectionHelper.isStatic(cls);
    }

    private boolean c(Since since) {
        if (since != null) {
            return this.f33540b >= since.value();
        }
        return true;
    }

    private boolean d(Until until) {
        if (until != null) {
            return this.f33540b < until.value();
        }
        return true;
    }

    private boolean e(Since since, Until until) {
        return c(since) && d(until);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean zExcludeClass = excludeClass(rawType, true);
        final boolean zExcludeClass2 = excludeClass(rawType, false);
        if (zExcludeClass || zExcludeClass2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private volatile TypeAdapter f33546a;

                private TypeAdapter a() {
                    TypeAdapter typeAdapter = this.f33546a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.f33546a = delegateAdapter;
                    return delegateAdapter;
                }

                @Override // com.google.gson.TypeAdapter
                /* JADX INFO: renamed from: read */
                public T read2(JsonReader jsonReader) throws IOException {
                    if (!zExcludeClass2) {
                        return (T) a().read2(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t10) throws IOException {
                    if (zExcludeClass) {
                        jsonWriter.nullValue();
                    } else {
                        a().write(jsonWriter, t10);
                    }
                }
            };
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderClone = clone();
        excluderClone.f33542d = false;
        return excluderClone;
    }

    public boolean excludeClass(Class<?> cls, boolean z10) {
        if (this.f33540b != -1.0d && !e((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if (!this.f33542d && b(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && ReflectionHelper.isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        Iterator it = (z10 ? this.f33544f : this.f33545g).iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean excludeField(Field field, boolean z10) {
        Expose expose;
        if ((this.f33541c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f33540b != -1.0d && !e((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f33543e && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z10 ? expose.deserialize() : expose.serialize()))) || excludeClass(field.getType(), z10)) {
            return true;
        }
        List list = z10 ? this.f33544f : this.f33545g;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).shouldSkipField(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderClone = clone();
        excluderClone.f33543e = true;
        return excluderClone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z10, boolean z11) {
        Excluder excluderClone = clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.f33544f);
            excluderClone.f33544f = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.f33545g);
            excluderClone.f33545g = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return excluderClone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderClone = clone();
        excluderClone.f33541c = 0;
        for (int i10 : iArr) {
            excluderClone.f33541c = i10 | excluderClone.f33541c;
        }
        return excluderClone;
    }

    public Excluder withVersion(double d10) {
        Excluder excluderClone = clone();
        excluderClone.f33540b = d10;
        return excluderClone;
    }
}
