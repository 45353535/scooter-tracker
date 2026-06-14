package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;

/* JADX INFO: loaded from: classes9.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InstanceFactory f33437b = new InstanceFactory(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33438a;

    private InstanceFactory(Object obj) {
        this.f33438a = obj;
    }

    private static InstanceFactory a() {
        return f33437b;
    }

    public static <T> Factory<T> create(T t10) {
        return new InstanceFactory(Preconditions.checkNotNull(t10, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t10) {
        return t10 == null ? a() : new InstanceFactory(t10);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public T get() {
        return (T) this.f33438a;
    }
}
