package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcs implements zzfax {
    public zzfcs(zzcdj zzcdjVar, zzgzy zzgzyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        final ListenableFuture listenableFutureZza = zzgzo.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgN)).booleanValue()) {
            listenableFutureZza = zzgzo.zza(null);
        }
        final ListenableFuture listenableFutureZza2 = zzgzo.zza(null);
        return zzgzo.zzo(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfct((String) listenableFutureZza.get(), (String) listenableFutureZza2.get());
            }
        }, zzcei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 47;
    }
}
