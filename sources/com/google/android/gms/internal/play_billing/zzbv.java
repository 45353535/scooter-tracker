package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzbv extends zzbw {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbw zzc;

    zzbv(zzbw zzbwVar, int i10, int i11) {
        Objects.requireNonNull(zzbwVar);
        this.zzc = zzbwVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbj.zza(i10, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    /* JADX INFO: renamed from: zzh */
    public final zzbw subList(int i10, int i11) {
        zzbj.zzd(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
