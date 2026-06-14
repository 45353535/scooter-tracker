package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzesu implements zzfax {
    private final Clock zza;
    private final zzfjk zzb;
    private final long zzc;

    zzesu(Clock clock, zzfjk zzfjkVar, long j10) {
        this.zza = clock;
        this.zzb = zzfjkVar;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzesv(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 4;
    }
}
