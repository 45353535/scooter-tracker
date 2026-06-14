package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class ThreadFactoryBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31609a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f31610b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f31611c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f31612d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ThreadFactory f31613e = null;

    private static ThreadFactory b(ThreadFactoryBuilder threadFactoryBuilder) {
        final String str = threadFactoryBuilder.f31609a;
        final Boolean bool = threadFactoryBuilder.f31610b;
        final Integer num = threadFactoryBuilder.f31611c;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.f31612d;
        ThreadFactory threadFactoryDefaultThreadFactory = threadFactoryBuilder.f31613e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory = threadFactoryDefaultThreadFactory;
        final AtomicLong atomicLong = str != null ? new AtomicLong(0L) : null;
        return new ThreadFactory() { // from class: com.google.common.util.concurrent.ThreadFactoryBuilder.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = threadFactory.newThread(runnable);
                Objects.requireNonNull(threadNewThread);
                String str2 = str;
                if (str2 != null) {
                    AtomicLong atomicLong2 = atomicLong;
                    Objects.requireNonNull(atomicLong2);
                    threadNewThread.setName(ThreadFactoryBuilder.c(str2, Long.valueOf(atomicLong2.getAndIncrement())));
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    threadNewThread.setDaemon(bool2.booleanValue());
                }
                Integer num2 = num;
                if (num2 != null) {
                    threadNewThread.setPriority(num2.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler2 != null) {
                    threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return threadNewThread;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory build() {
        return b(this);
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setDaemon(boolean z10) {
        this.f31610b = Boolean.valueOf(z10);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setNameFormat(String str) {
        c(str, 0);
        this.f31609a = str;
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setPriority(int i10) {
        Preconditions.checkArgument(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        Preconditions.checkArgument(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f31611c = Integer.valueOf(i10);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.f31613e = (ThreadFactory) Preconditions.checkNotNull(threadFactory);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f31612d = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
