package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
final class zzer extends zzcz {
    private final com.google.android.gms.measurement.internal.zzjp zza;

    zzer(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.interceptEvent(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
