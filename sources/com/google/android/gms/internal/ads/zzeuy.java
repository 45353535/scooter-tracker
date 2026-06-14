package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeuy implements zzfax {
    private final zzfjk zza;

    zzeuy(zzfjk zzfjkVar) {
        this.zza = zzfjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzeuz(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 58;
    }
}
