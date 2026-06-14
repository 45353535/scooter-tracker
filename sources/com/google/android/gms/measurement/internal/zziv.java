package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
final class zziv implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjd zzc;

    zziv(zzjd zzjdVar, zzr zzrVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = bundle;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzZ();
        return zzjdVar.zzL().zzaq(this.zza, this.zzb);
    }
}
