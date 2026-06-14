package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* JADX INFO: loaded from: classes7.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InstanceFactory f24407b = new InstanceFactory(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24408a;

    private InstanceFactory(Object obj) {
        this.f24408a = obj;
    }

    private static InstanceFactory a() {
        return f24407b;
    }

    public static <T> Factory<T> create(T t10) {
        return new InstanceFactory(Preconditions.checkNotNull(t10, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t10) {
        return t10 == null ? a() : new InstanceFactory(t10);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public T get() {
        return (T) this.f24408a;
    }
}
