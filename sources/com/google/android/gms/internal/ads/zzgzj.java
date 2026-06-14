package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public class zzgzj extends zzgzk {
    private final ListenableFuture zza;

    protected zzgzj(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk, com.google.android.gms.internal.ads.zzgzi
    protected final /* synthetic */ Future zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi, com.google.android.gms.internal.ads.zzgtw
    protected final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    protected final ListenableFuture zzc() {
        return this.zza;
    }
}
