package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgtq extends zzgts {
    zzgtq() {
        super(null);
    }

    static final zzgts zzf(int i10) {
        return i10 < 0 ? zzgts.zzb : i10 > 0 ? zzgts.zzc : zzgts.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzc(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final int zze() {
        return 0;
    }
}
