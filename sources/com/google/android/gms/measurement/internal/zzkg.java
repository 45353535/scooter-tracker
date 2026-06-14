package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzkg extends zzay {
    final /* synthetic */ zzlj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzkg(zzlj zzljVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        zzlj zzljVar = this.zza;
        if (zzljVar.zzu.zzI()) {
            zzljVar.zzap().zzb(2000L);
        }
    }
}
