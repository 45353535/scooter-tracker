package com.google.android.gms.ads.internal.util.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
final class zza implements ThreadFactory {
    final /* synthetic */ String zza;
    private final AtomicInteger zzb = new AtomicInteger(1);

    zza(String str) {
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zzb.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 12 + length);
        sb2.append("AdWorker(");
        sb2.append(str);
        sb2.append(") #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
