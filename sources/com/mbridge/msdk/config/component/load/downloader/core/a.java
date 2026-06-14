package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f46946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f46947b;

    a(int i10) {
        b bVar = new b(i10 <= 0 ? 10 : i10, new o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.f46947b = bVar;
        bVar.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.f46946a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.j
    public ExecutorService getDownloadResultTasks() {
        return this.f46946a;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.j
    public b getDownloadTasks() {
        return this.f46947b;
    }
}
