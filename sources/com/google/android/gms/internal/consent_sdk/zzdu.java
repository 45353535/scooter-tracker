package com.google.android.gms.internal.consent_sdk;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzdu extends zzdv {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzdv zzc;

    zzdu(zzdv zzdvVar, int i10, int i11) {
        Objects.requireNonNull(zzdvVar);
        this.zzc = zzdvVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzdj.zza(i10, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv
    /* JADX INFO: renamed from: zzf */
    public final zzdv subList(int i10, int i11) {
        zzdj.zzc(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
