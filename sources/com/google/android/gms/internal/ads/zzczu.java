package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes8.dex */
final class zzczu implements zzgzl {
    final /* synthetic */ zzczw zza;

    zzczu(zzczw zzczwVar) {
        Objects.requireNonNull(zzczwVar);
        this.zza = zzczwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zza();
    }
}
