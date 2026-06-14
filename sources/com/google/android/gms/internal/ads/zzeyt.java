package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeyt implements zzfax {
    private final zzfiq zza;

    zzeyt(zzfiq zzfiqVar) {
        this.zza = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzeyu(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 25;
    }
}
