package com.bytedance.sdk.component.jpc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class tvp implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    public static volatile boolean sCrashHappened;
    protected int lnr;
    private final AtomicInteger mml;
    protected final ThreadGroup qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected final String f16507ud;

    public tvp(String str) {
        this(5, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (sCrashHappened) {
            return null;
        }
        Thread threadQdl = qdl(this.qdl, runnable, this.f16507ud + this.mml.getAndIncrement());
        if (threadQdl.isDaemon()) {
            threadQdl.setDaemon(false);
        }
        int i10 = this.lnr;
        if (i10 > 10 || i10 <= 0) {
            this.lnr = 5;
        }
        threadQdl.setPriority(this.lnr);
        return threadQdl;
    }

    protected Thread qdl(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public tvp(int i10, String str) {
        this.mml = new AtomicInteger(1);
        this.lnr = i10;
        this.qdl = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.f16507ud = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
