package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbqb implements zzgyw {
    final /* synthetic */ zzbpt zza;

    zzbqb(zzbqf zzbqfVar, zzbpt zzbptVar) {
        this.zza = zzbptVar;
        Objects.requireNonNull(zzbqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcen zzcenVar = new zzcen();
        ((zzbpz) obj).zze(this.zza, new zzbqa(this, zzcenVar));
        return zzcenVar;
    }
}
