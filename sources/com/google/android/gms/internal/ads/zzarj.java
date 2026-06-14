package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzarj implements Runnable {
    final /* synthetic */ zzary zza;
    final /* synthetic */ zzark zzb;

    zzarj(zzark zzarkVar, zzary zzaryVar) {
        this.zza = zzaryVar;
        Objects.requireNonNull(zzarkVar);
        this.zzb = zzarkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
