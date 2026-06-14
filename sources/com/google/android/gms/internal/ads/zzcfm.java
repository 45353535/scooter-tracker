package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcfm implements Runnable {
    final /* synthetic */ zzcfs zza;

    zzcfm(zzcfs zzcfsVar) {
        Objects.requireNonNull(zzcfsVar);
        this.zza = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
