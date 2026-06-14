package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
final class zzfmc implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    zzfmc() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 14);
        sb2.append("AdWorker(NG) #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
