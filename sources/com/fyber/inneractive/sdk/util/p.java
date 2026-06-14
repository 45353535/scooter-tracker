package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f23891a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "IAConcurrencyUtil#" + this.f23891a.getAndIncrement());
    }
}
