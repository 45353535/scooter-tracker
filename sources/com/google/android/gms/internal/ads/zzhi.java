package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhi implements zzha {

    @Nullable
    private zzhz zzb;

    @Nullable
    private String zzc;
    private boolean zzf;
    private final zzht zza = new zzht();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhi zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    public final zzhi zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzhi zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzhi zze(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzhi zzf(@Nullable zzhz zzhzVar) {
        this.zzb = zzhzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhm zza() {
        zzhm zzhmVar = new zzhm(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzhz zzhzVar = this.zzb;
        if (zzhzVar != null) {
            zzhmVar.zze(zzhzVar);
        }
        return zzhmVar;
    }
}
