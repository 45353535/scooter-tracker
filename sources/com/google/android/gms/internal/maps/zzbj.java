package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzbj extends zzbk {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbk zzc;

    zzbj(zzbk zzbkVar, int i10, int i11) {
        this.zzc = zzbkVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbc.zza(i10, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.maps.zzbk
    /* JADX INFO: renamed from: zzf */
    public final zzbk subList(int i10, int i11) {
        zzbc.zzc(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
