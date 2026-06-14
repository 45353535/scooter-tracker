package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzehn {
    private final zzehj zza;
    private final zzgzy zzb;

    public zzehn(zzehj zzehjVar, zzgzy zzgzyVar) {
        this.zza = zzehjVar;
        this.zzb = zzgzyVar;
    }

    public final void zza(zzfmu zzfmuVar) {
        final zzehj zzehjVar = this.zza;
        Objects.requireNonNull(zzehjVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzehjVar.getWritableDatabase();
            }
        };
        zzgzy zzgzyVar = this.zzb;
        zzgzo.zzr(zzgzyVar.zzc(callable), new zzehl(this, zzfmuVar), zzgzyVar);
    }
}
