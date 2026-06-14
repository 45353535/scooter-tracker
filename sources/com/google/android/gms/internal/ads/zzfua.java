package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfua implements Runnable {
    final /* synthetic */ zzfub zza;
    private final WebView zzb;

    zzfua(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
        this.zzb = zzfubVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
