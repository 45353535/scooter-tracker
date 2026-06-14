package com.google.common.reflect;

import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeParameter<T> extends TypeCapture<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TypeVariable f31173b;

    public final boolean equals(Object obj) {
        if (obj instanceof TypeParameter) {
            return this.f31173b.equals(((TypeParameter) obj).f31173b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31173b.hashCode();
    }

    public String toString() {
        return this.f31173b.toString();
    }
}
