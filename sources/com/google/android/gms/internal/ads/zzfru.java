package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfru implements Runnable {
    final /* synthetic */ zzfsa zza;

    zzfru(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzG();
    }
}
