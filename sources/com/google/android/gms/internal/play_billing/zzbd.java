package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbd {
    private static final zzbo zza;

    static {
        zzbo zzbcVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzbcVar = new zzbb();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzbcVar = new zzbc();
        }
        zza = zzbcVar;
    }

    public static zzbo zza() {
        return zza;
    }
}
