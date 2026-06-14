package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
final class zzes extends zzcz {
    private final com.google.android.gms.measurement.internal.zzjq zza;

    zzes(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.onEvent(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
