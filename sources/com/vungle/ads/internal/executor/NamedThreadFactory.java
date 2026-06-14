package com.vungle.ads.internal.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "name", "", "(Ljava/lang/String;)V", "atomicInteger", "Ljava/util/concurrent/atomic/AtomicInteger;", "getName", "()Ljava/lang/String;", "threadFactory", "kotlin.jvm.PlatformType", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NamedThreadFactory implements ThreadFactory {

    @NotNull
    private final AtomicInteger atomicInteger;

    @NotNull
    private final String name;
    private final ThreadFactory threadFactory;

    public NamedThreadFactory(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable r10) {
        Intrinsics.checkNotNullParameter(r10, "r");
        Thread t10 = this.threadFactory.newThread(r10);
        t10.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        Intrinsics.checkNotNullExpressionValue(t10, "t");
        return t10;
    }
}
