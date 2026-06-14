package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
class LazySet<T> implements Provider<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f31810b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f31809a = Collections.newSetFromMap(new ConcurrentHashMap());

    LazySet(Collection collection) {
        this.f31809a.addAll(collection);
    }

    static LazySet b(Collection collection) {
        return new LazySet((Set) collection);
    }

    private synchronized void c() {
        try {
            Iterator it = this.f31809a.iterator();
            while (it.hasNext()) {
                this.f31810b.add(((Provider) it.next()).get());
            }
            this.f31809a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(Provider provider) {
        try {
            if (this.f31810b == null) {
                this.f31809a.add(provider);
            } else {
                this.f31810b.add(provider.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.inject.Provider
    public Set<T> get() {
        if (this.f31810b == null) {
            synchronized (this) {
                try {
                    if (this.f31810b == null) {
                        this.f31810b = Collections.newSetFromMap(new ConcurrentHashMap());
                        c();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f31810b);
    }
}
