package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcvx {
    private final zzdeg zza;

    @Nullable
    private final zzdgl zzb;

    public zzcvx(zzdeg zzdegVar, @Nullable zzdgl zzdglVar) {
        this.zza = zzdegVar;
        this.zzb = zzdglVar;
    }

    public final zzdeg zza() {
        return this.zza;
    }

    final zzdje zzb() {
        zzdgl zzdglVar = this.zzb;
        return zzdglVar != null ? new zzdje(zzdglVar, zzcei.zzg) : new zzdje(new zzcvw(this), zzcei.zzg);
    }

    @Nullable
    final zzdgl zzc() {
        return this.zzb;
    }
}
