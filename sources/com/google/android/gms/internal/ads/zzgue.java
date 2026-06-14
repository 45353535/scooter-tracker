package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzgue extends zzguf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzguf zzc;

    zzgue(zzguf zzgufVar, int i10, int i11) {
        Objects.requireNonNull(zzgufVar);
        this.zzc = zzgufVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgrc.zzm(i10, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzguf, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    /* JADX INFO: renamed from: zzh */
    public final zzguf subList(int i10, int i11) {
        zzgrc.zzo(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
