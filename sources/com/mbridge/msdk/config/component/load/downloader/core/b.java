package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class b extends ThreadPoolExecutor {
    b(int i10, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i10 * 2, 15L, TimeUnit.MICROSECONDS, new PriorityBlockingQueue(), threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        c cVar = new c((h) runnable);
        execute(cVar);
        return cVar;
    }
}
