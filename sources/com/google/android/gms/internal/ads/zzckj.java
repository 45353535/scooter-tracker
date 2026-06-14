package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzckj implements Runnable {
    final /* synthetic */ zzcko zza;

    zzckj(zzcko zzckoVar) {
        Objects.requireNonNull(zzckoVar);
        this.zza = zzckoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
