package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfng implements zzgzl {
    final /* synthetic */ zzfnb zza;
    final /* synthetic */ zzfnl zzb;

    zzfng(zzfnl zzfnlVar, zzfnb zzfnbVar) {
        this.zza = zzfnbVar;
        Objects.requireNonNull(zzfnlVar);
        this.zzb = zzfnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zzb.zza.zzg().zzc(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
