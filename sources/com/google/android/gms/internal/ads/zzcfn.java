package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcfn implements Runnable {
    final /* synthetic */ zzcfs zza;

    zzcfn(zzcfs zzcfsVar) {
        Objects.requireNonNull(zzcfsVar);
        this.zza = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
