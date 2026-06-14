package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfwf;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzh implements zzfwf {
    final /* synthetic */ zzk zza;

    zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i10, long j10) {
        this.zza.zzo().zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzo().zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
