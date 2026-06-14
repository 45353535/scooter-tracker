package com.startapp.sdk.internal;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes11.dex */
public final class c4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f64336a;

    public c4(ThreadPoolExecutor threadPoolExecutor) {
        this.f64336a = threadPoolExecutor;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return Integer.valueOf(this.f64336a.getMaximumPoolSize() - this.f64336a.getActiveCount());
    }
}
