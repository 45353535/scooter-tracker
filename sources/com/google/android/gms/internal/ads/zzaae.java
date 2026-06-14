package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class zzaae implements zzaac {
    private final zzaac zza;

    public zzaae(zzaac zzaacVar) {
        this.zza = zzaacVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaae) {
            return this.zza.equals(((zzaae) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public zzbg zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public zzv zzb(int i10) {
        return this.zza.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public zzv zzc() {
        return this.zza.zzc();
    }

    public final zzaac zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzg(int i10) {
        return this.zza.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final int zzh() {
        return this.zza.zzh();
    }
}
