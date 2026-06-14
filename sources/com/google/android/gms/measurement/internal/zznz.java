package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zznz extends zzay {
    final /* synthetic */ zzoa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zznz(zzoa zzoaVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzoaVar);
        this.zza = zzoaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        zzoa zzoaVar = this.zza;
        zzoc zzocVar = zzoaVar.zzc;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        zzoaVar.zzd(false, false, zzicVar.zzaZ().elapsedRealtime());
        zzocVar.zzu.zzw().zzc(zzicVar.zzaZ().elapsedRealtime());
    }
}
