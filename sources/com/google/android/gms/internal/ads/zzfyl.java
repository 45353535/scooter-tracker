package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class zzfyl implements zzfyk {
    private zzfyl() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final ExecutorService zza(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final ExecutorService zzb(int i10) {
        return zza(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final ExecutorService zzc(ThreadFactory threadFactory, int i10) {
        return zza(1, threadFactory, 1);
    }

    /* synthetic */ zzfyl(byte[] bArr) {
    }
}
