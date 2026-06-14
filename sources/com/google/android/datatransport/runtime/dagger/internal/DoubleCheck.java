package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import kf.a;

/* JADX INFO: loaded from: classes7.dex */
public final class DoubleCheck<T> implements a, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f24404c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile a f24405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f24406b = f24404c;

    private DoubleCheck(a aVar) {
        this.f24405a = aVar;
    }

    private static Object a(Object obj, Object obj2) {
        if (obj == f24404c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <P extends a, T> Lazy<T> lazy(P p10) {
        return p10 instanceof Lazy ? (Lazy) p10 : new DoubleCheck((a) Preconditions.checkNotNull(p10));
    }

    public static <P extends a, T> a provider(P p10) {
        Preconditions.checkNotNull(p10);
        return p10 instanceof DoubleCheck ? p10 : new DoubleCheck(p10);
    }

    @Override // kf.a
    public T get() {
        T t10;
        T t11 = (T) this.f24406b;
        Object obj = f24404c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f24406b;
                if (t10 == obj) {
                    t10 = (T) this.f24405a.get();
                    this.f24406b = a(this.f24406b, t10);
                    this.f24405a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
