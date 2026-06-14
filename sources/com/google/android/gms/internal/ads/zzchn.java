package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzchn implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzchr zzj;

    zzchn(zzchr zzchrVar, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
        Objects.requireNonNull(zzchrVar);
        this.zzj = zzchrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bytesLoaded", Integer.toString(this.zzc));
        map.put("totalBytes", Integer.toString(this.zzd));
        map.put("bufferedDuration", Long.toString(this.zze));
        map.put("totalDuration", Long.toString(this.zzf));
        map.put("cacheReady", true != this.zzg ? "0" : "1");
        map.put("playerCount", Integer.toString(this.zzh));
        map.put("playerPreparedCount", Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", map);
    }
}
