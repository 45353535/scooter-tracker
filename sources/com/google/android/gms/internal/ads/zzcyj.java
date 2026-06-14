package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcyj {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    @VisibleForTesting
    public zzcyj() {
    }

    public final void zza(String str) {
        synchronized (this.zza) {
            try {
                ConcurrentHashMap concurrentHashMap = this.zzb;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zzb(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzc(String str) {
        Long l10 = (Long) this.zzd.get(str);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public final void zzd(String str, long j10) {
        this.zzc.put(str, Long.valueOf(j10));
    }

    public final void zze(String str, String str2, long j10) {
        ConcurrentHashMap concurrentHashMap = this.zzc;
        Long l10 = (Long) concurrentHashMap.get(str2);
        if (l10 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.zzd.put(str, Long.valueOf(j10 - l10.longValue()));
    }
}
