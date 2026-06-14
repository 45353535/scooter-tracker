package com.google.android.gms.measurement.internal;

import android.util.Log;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzjr implements zzgm {
    final /* synthetic */ zzic zza;

    zzjr(zzjs zzjsVar, zzic zzicVar) {
        this.zza = zzicVar;
        Objects.requireNonNull(zzjsVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final boolean zza() {
        return Log.isLoggable(this.zza.zzaV().zzn(), 3);
    }
}
