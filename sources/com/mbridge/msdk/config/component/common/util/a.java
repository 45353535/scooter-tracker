package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f46845a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f46846b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f46847c = new AtomicBoolean(false);

    public T a(long j10) throws InterruptedException {
        if (this.f46845a.await(j10, TimeUnit.MILLISECONDS)) {
            return this.f46846b.get();
        }
        return null;
    }

    public boolean a(T t10) {
        if (!this.f46847c.compareAndSet(false, true)) {
            return false;
        }
        this.f46846b.set(t10);
        this.f46845a.countDown();
        return true;
    }
}
