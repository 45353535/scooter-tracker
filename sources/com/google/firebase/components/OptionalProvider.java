package com.google.firebase.components;

import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Deferred.DeferredHandler f31811c = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.p
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            OptionalProvider.c(provider);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Provider f31812d = new Provider() { // from class: com.google.firebase.components.q
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return OptionalProvider.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Deferred.DeferredHandler f31813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Provider f31814b;

    private OptionalProvider(Deferred.DeferredHandler deferredHandler, Provider provider) {
        this.f31813a = deferredHandler;
        this.f31814b = provider;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    public static /* synthetic */ void c(Provider provider) {
    }

    static OptionalProvider d() {
        return new OptionalProvider(f31811c, f31812d);
    }

    static OptionalProvider e(Provider provider) {
        return new OptionalProvider(null, provider);
    }

    void f(Provider provider) {
        Deferred.DeferredHandler deferredHandler;
        if (this.f31814b != f31812d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            deferredHandler = this.f31813a;
            this.f31813a = null;
            this.f31814b = provider;
        }
        deferredHandler.handle(provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return (T) this.f31814b.get();
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(@NonNull final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.f31814b;
        Provider<T> provider4 = f31812d;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f31814b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler deferredHandler2 = this.f31813a;
                this.f31813a = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.s
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        OptionalProvider.b(deferredHandler2, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }
}
