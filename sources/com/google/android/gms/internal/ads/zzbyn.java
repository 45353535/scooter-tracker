package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.lang.Thread;

/* JADX INFO: loaded from: classes8.dex */
final class zzbyn implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbyp zzb;

    zzbyn(zzbyp zzbypVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        Objects.requireNonNull(zzbypVar);
        this.zzb = zzbypVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                this.zzb.zzg(thread, th2);
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("AdMob exception reporter failed reporting the exception.");
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        } catch (Throwable th3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zza;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th2);
            }
            throw th3;
        }
    }
}
