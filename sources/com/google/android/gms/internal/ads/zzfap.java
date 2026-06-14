package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfap implements zzfax {
    private final boolean zza;

    zzfap(@Nullable zzfgn zzfgnVar) {
        this.zza = zzfgnVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzfao(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 36;
    }
}
