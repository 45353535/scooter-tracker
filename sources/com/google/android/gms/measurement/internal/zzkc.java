package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzkc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzlj zzi;

    zzkc(zzlj zzljVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = bundle;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = str3;
        Objects.requireNonNull(zzljVar);
        this.zzi = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzH(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
