package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbsd implements zzcer {
    final /* synthetic */ zzbsf zza;

    zzbsd(zzbsf zzbsfVar) {
        Objects.requireNonNull(zzbsfVar);
        this.zza = zzbsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
