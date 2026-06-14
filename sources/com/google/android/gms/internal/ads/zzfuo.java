package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzfuo implements Runnable {
    zzfuo() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfur.zzc != null) {
            zzfur.zzc.post(zzfur.zzk);
            zzfur.zzc.postDelayed(zzfur.zzl, 200L);
        }
    }
}
