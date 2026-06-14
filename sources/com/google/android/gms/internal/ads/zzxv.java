package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzxv implements zzaam {
    public long zza;
    public long zzb;

    @Nullable
    public zzaal zzc;

    @Nullable
    public zzxv zzd;

    public zzxv(long j10, int i10) {
        zza(j10, 65536);
    }

    public final void zza(long j10, int i10) {
        zzgrc.zzi(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int zzb(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzxv zzc() {
        this.zzc = null;
        zzxv zzxvVar = this.zzd;
        this.zzd = null;
        return zzxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zzd() {
        zzaal zzaalVar = this.zzc;
        zzaalVar.getClass();
        return zzaalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    @Nullable
    public final zzaam zze() {
        zzxv zzxvVar = this.zzd;
        if (zzxvVar == null || zzxvVar.zzc == null) {
            return null;
        }
        return zzxvVar;
    }
}
