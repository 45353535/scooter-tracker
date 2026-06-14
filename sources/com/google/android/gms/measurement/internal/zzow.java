package com.google.android.gms.measurement.internal;

import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzow implements zzgw {
    final /* synthetic */ String zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ zzpg zzc;

    zzow(zzpg zzpgVar, String str, List list) {
        this.zza = str;
        this.zzb = list;
        Objects.requireNonNull(zzpgVar);
        this.zzc = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void zza(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.zzc.zzV(true, i10, th2, bArr, this.zza, this.zzb);
    }
}
