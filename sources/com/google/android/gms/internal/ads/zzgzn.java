package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgzn {
    private final boolean zza;
    private final zzguf zzb;

    /* synthetic */ zzgzn(boolean z10, zzguf zzgufVar, byte[] bArr) {
        this.zza = z10;
        this.zzb = zzgufVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgzc(this.zzb, this.zza, executor, callable);
    }
}
