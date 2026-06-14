package com.google.android.gms.internal.measurement;

import androidx.annotation.BinderThread;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzdu extends zzcw {
    final /* synthetic */ Runnable zza;

    zzdu(zzdv zzdvVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzdvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcx
    @BinderThread
    public final void zze() {
        this.zza.run();
    }
}
