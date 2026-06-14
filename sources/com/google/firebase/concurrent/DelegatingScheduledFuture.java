package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"RestrictedApi"})
class DelegatingScheduledFuture<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f31851b;

    interface Completer<T> {
        void set(T t10);

        void setException(Throwable th2);
    }

    interface Resolver<T> {
        ScheduledFuture<?> addCompleter(Completer<T> completer);
    }

    DelegatingScheduledFuture(Resolver resolver) {
        this.f31851b = resolver.addCompleter(new Completer<V>() { // from class: com.google.firebase.concurrent.DelegatingScheduledFuture.1
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void set(V v10) {
                DelegatingScheduledFuture.this.set(v10);
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void setException(Throwable th2) {
                DelegatingScheduledFuture.this.setException(th2);
            }
        });
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    protected void afterDone() {
        this.f31851b.cancel(wasInterrupted());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f31851b.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f31851b.compareTo(delayed);
    }
}
