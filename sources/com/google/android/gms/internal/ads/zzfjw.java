package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfjw implements zzgzl {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ int zzb;

    zzfjw(zzfjx zzfjxVar, int i10) {
        this.zzb = i10;
        Objects.requireNonNull(zzfjxVar);
        this.zza = zzfjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
