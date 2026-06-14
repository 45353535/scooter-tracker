package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzchl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzchr zze;

    zzchl(zzchr zzchrVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        Objects.requireNonNull(zzchrVar);
        this.zze = zzchrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bytesLoaded", Integer.toString(this.zzc));
        map.put("totalBytes", Integer.toString(this.zzd));
        map.put("cacheReady", "0");
        this.zze.zzw("onPrecacheEvent", map);
    }
}
