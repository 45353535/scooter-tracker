package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzezu implements zzfax {
    private final String zza;
    private final int zzb;

    zzezu(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzezv(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 31;
    }
}
