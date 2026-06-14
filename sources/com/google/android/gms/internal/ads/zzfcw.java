package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcw implements zzfax {
    final zzgzy zza;
    final List zzb;

    public zzfcw(zzbgo zzbgoVar, zzgzy zzgzyVar, List list) {
        this.zza = zzgzyVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfcx(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 48;
    }
}
