package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
class CustomThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f31844e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f31845a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f31848d;

    CustomThreadFactory(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f31846b = str;
        this.f31847c = i10;
        this.f31848d = threadPolicy;
    }

    public static /* synthetic */ void a(CustomThreadFactory customThreadFactory, Runnable runnable) {
        Process.setThreadPriority(customThreadFactory.f31847c);
        StrictMode.ThreadPolicy threadPolicy = customThreadFactory.f31848d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f31844e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                CustomThreadFactory.a(this.f31881b, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f31846b, Long.valueOf(this.f31845a.getAndIncrement())));
        return threadNewThread;
    }
}
