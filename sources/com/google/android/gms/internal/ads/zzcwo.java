package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcwo implements zzgzl {
    final /* synthetic */ zzgzl zza;
    final /* synthetic */ zzcwu zzb;

    zzcwo(zzcwu zzcwuVar, zzgzl zzgzlVar) {
        this.zza = zzgzlVar;
        Objects.requireNonNull(zzcwuVar);
        this.zzb = zzcwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zza.zza(th2);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcwn) obj).zza, this.zza);
    }
}
