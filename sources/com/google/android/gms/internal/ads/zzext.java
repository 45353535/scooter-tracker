package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzext implements zzfax {
    private final zzgzy zza;

    public zzext(zzgzy zzgzyVar) {
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.zzc(zzexs.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 20;
    }
}
