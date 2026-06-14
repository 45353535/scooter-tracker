package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import j$.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
final class zzcco implements ThreadFactory {
    private final AtomicInteger zza;

    zzcco(zzccq zzccqVar) {
        Objects.requireNonNull(zzccqVar);
        this.zza = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 31);
        sb2.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
