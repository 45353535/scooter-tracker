package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzhag {
    static void zza(Throwable th2) {
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    static void zzb(Throwable th2) {
        if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
            throw ((Error) th2);
        }
    }
}
