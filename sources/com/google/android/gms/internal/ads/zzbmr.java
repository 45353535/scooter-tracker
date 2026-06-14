package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbmr extends zzbly {
    final /* synthetic */ zzbms zza;

    /* synthetic */ zzbmr(zzbms zzbmsVar, byte[] bArr) {
        Objects.requireNonNull(zzbmsVar);
        this.zza = zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) {
        zzbms zzbmsVar = this.zza;
        zzbmsVar.zzc().zzb(zzbmsVar.zze(zzblmVar));
    }
}
