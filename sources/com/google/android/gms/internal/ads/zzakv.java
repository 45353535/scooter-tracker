package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzakv {
    public final zzalc zza;
    public final zzalf zzb;
    public final zzagh zzc;

    @Nullable
    public final zzagi zzd;
    public int zze;

    @Nullable
    public zzv zzf;

    public zzakv(zzalc zzalcVar, zzalf zzalfVar, zzagh zzaghVar) {
        this.zza = zzalcVar;
        this.zzb = zzalfVar;
        this.zzc = zzaghVar;
        this.zzd = "audio/true-hd".equals(zzalcVar.zzg.zzo) ? new zzagi() : null;
    }
}
