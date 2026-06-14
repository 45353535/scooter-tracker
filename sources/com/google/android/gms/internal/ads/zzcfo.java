package com.google.android.gms.internal.ads;

import com.ironsource.C4329g8;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcfo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcfs zzb;

    zzcfo(zzcfs zzcfsVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzcfsVar);
        this.zzb = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{C4329g8.f43166k, String.valueOf(this.zza)});
    }
}
