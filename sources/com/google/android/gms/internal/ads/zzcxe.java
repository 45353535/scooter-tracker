package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes8.dex */
final class zzcxe implements zzgzl {
    final /* synthetic */ zzcxj zza;

    zzcxe(zzcxj zzcxjVar) {
        Objects.requireNonNull(zzcxjVar);
        this.zza = zzcxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zza.zzk().zzm(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzm(true);
    }
}
