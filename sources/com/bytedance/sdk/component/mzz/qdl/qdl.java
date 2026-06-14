package com.bytedance.sdk.component.mzz.qdl;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements ThreadFactory {
    private final ThreadGroup qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final AtomicInteger f16642ud = new AtomicInteger(1);

    public qdl(String str) {
        this.qdl = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.qdl, runnable, "tt_img_" + this.f16642ud.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
