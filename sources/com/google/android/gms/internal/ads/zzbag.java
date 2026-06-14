package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
final class zzbag implements ThreadFactory {
    private final ThreadFactory zza = Executors.defaultThreadFactory();
    private final AtomicInteger zzb = new AtomicInteger(1);

    zzbag() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.zzb;
        Thread threadNewThread = this.zza.newThread(runnable);
        int andIncrement = atomicInteger.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 5);
        sb2.append("gads-");
        sb2.append(andIncrement);
        threadNewThread.setName(sb2.toString());
        return threadNewThread;
    }
}
