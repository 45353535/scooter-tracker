package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzchp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzchr zzd;

    zzchp(zzchr zzchrVar, String str, String str2, long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        Objects.requireNonNull(zzchrVar);
        this.zzd = zzchrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("totalDuration", Long.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", map);
    }
}
