package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class FieldDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32754b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f32756b = null;

        Builder(String str) {
            this.f32755a = str;
        }

        @NonNull
        public FieldDescriptor build() {
            return new FieldDescriptor(this.f32755a, this.f32756b == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(this.f32756b)));
        }

        @NonNull
        public <T extends Annotation> Builder withProperty(@NonNull T t10) {
            if (this.f32756b == null) {
                this.f32756b = new HashMap();
            }
            this.f32756b.put(t10.annotationType(), t10);
            return this;
        }
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str);
    }

    @NonNull
    public static FieldDescriptor of(@NonNull String str) {
        return new FieldDescriptor(str, Collections.EMPTY_MAP);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f32753a.equals(fieldDescriptor.f32753a) && this.f32754b.equals(fieldDescriptor.f32754b);
    }

    @NonNull
    public String getName() {
        return this.f32753a;
    }

    @Nullable
    public <T extends Annotation> T getProperty(@NonNull Class<T> cls) {
        return (T) this.f32754b.get(cls);
    }

    public int hashCode() {
        return (this.f32753a.hashCode() * 31) + this.f32754b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f32753a + ", properties=" + this.f32754b.values() + "}";
    }

    private FieldDescriptor(String str, Map map) {
        this.f32753a = str;
        this.f32754b = map;
    }
}
