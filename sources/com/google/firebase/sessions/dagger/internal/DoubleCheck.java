package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;
import kf.a;

/* JADX INFO: loaded from: classes9.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f33434c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Provider f33435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f33436b = f33434c;

    private DoubleCheck(Provider provider) {
        this.f33435a = provider;
    }

    private static Object a(Object obj, Object obj2) {
        if (obj == f33434c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <P extends Provider<T>, T> Lazy<T> lazy(P p10) {
        return p10 instanceof Lazy ? (Lazy) p10 : new DoubleCheck((Provider) Preconditions.checkNotNull(p10));
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p10) {
        Preconditions.checkNotNull(p10);
        return p10 instanceof DoubleCheck ? p10 : new DoubleCheck(p10);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public T get() {
        T t10;
        T t11 = (T) this.f33436b;
        Object obj = f33434c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f33436b;
                if (t10 == obj) {
                    t10 = (T) this.f33435a.get();
                    this.f33436b = a(this.f33436b, t10);
                    this.f33435a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public static <P extends a, T> Lazy<T> lazy(P p10) {
        return lazy(Providers.asDaggerProvider(p10));
    }

    @Deprecated
    public static <P extends a, T> a provider(P p10) {
        return provider(Providers.asDaggerProvider(p10));
    }
}
