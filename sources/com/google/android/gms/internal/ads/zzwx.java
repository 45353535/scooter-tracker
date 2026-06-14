package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzwx extends zzaae {
    private final zzbg zza;

    public zzwx(zzaac zzaacVar, zzbg zzbgVar) {
        super(zzaacVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final boolean equals(@Nullable Object obj) {
        if (super.equals(obj) && (obj instanceof zzwx)) {
            return this.zza.equals(((zzwx) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final int hashCode() {
        return (super.hashCode() * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzaae, com.google.android.gms.internal.ads.zzaah
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaae, com.google.android.gms.internal.ads.zzaah
    public final zzv zzb(int i10) {
        return this.zza.zza(zzd().zzf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzaae, com.google.android.gms.internal.ads.zzaac
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
