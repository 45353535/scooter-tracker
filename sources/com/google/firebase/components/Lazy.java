package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public class Lazy<T> implements Provider<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f31806c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f31807a = f31806c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Provider f31808b;

    public Lazy(Provider<T> provider) {
        this.f31808b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t10;
        T t11 = (T) this.f31807a;
        Object obj = f31806c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f31807a;
                if (t10 == obj) {
                    t10 = (T) this.f31808b.get();
                    this.f31807a = t10;
                    this.f31808b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
