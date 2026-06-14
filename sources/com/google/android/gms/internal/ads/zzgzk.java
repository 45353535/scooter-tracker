package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgzk extends zzgzi implements ListenableFuture {
    protected zzgzk() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    protected /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    protected abstract ListenableFuture zzc();
}
