package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzezn implements zzfax {

    @Nullable
    private final Bundle zza;

    zzezn(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzezo(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 30;
    }
}
