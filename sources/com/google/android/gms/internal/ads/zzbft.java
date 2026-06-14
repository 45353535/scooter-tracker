package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbft extends zzcen {
    final /* synthetic */ zzbfz zza;

    zzbft(zzbfz zzbfzVar) {
        Objects.requireNonNull(zzbfzVar);
        this.zza = zzbfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcen, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.zza.zzb();
        return super.cancel(z10);
    }
}
