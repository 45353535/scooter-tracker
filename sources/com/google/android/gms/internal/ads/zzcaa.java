package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcaa {
    public final long zza;
    public final zzbzy zzb;

    public zzcaa(zzcab zzcabVar, zzbzy zzbzyVar) {
        Objects.requireNonNull(zzcabVar);
        this.zza = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzb = zzbzyVar;
    }
}
