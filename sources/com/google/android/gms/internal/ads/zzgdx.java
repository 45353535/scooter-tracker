package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgdx implements zzgyw {
    final /* synthetic */ zzgec zza;

    zzgdx(zzgec zzgecVar) {
        Objects.requireNonNull(zzgecVar);
        this.zza = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzgdv zzgdvVar = (zzgdv) obj;
        if (zzgdvVar != null) {
            return zzgzo.zza(zzgdvVar);
        }
        zzgec zzgecVar = this.zza;
        zzgecVar.zza().zzb(51);
        return zzgecVar.zzd(2);
    }
}
