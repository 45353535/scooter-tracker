package com.google.gson;

import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public final class FieldAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f33517a;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.f33517a = field;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f33517a.getAnnotation(cls);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.f33517a.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.f33517a.getType();
    }

    public Type getDeclaredType() {
        return this.f33517a.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.f33517a.getDeclaringClass();
    }

    public String getName() {
        return this.f33517a.getName();
    }

    public boolean hasModifier(int i10) {
        return (i10 & this.f33517a.getModifiers()) != 0;
    }

    public String toString() {
        return this.f33517a.toString();
    }
}
