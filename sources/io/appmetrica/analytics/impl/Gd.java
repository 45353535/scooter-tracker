package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class Gd implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f75819a = new AtomicInteger(0);

    public static int a() {
        return f75819a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, ((String) null) + TokenBuilder.TOKEN_DELIMITER + f75819a.incrementAndGet());
    }
}
