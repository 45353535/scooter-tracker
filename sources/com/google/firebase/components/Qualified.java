package com.google.firebase.components;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes9.dex */
public final class Qualified<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f31815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f31816b;

    private @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f31815a = cls;
        this.f31816b = cls2;
    }

    @NonNull
    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    @NonNull
    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.f31816b.equals(qualified.f31816b)) {
            return this.f31815a.equals(qualified.f31815a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f31816b.hashCode() * 31) + this.f31815a.hashCode();
    }

    public String toString() {
        if (this.f31815a == Unqualified.class) {
            return this.f31816b.getName();
        }
        return "@" + this.f31815a.getName() + " " + this.f31816b.getName();
    }
}
