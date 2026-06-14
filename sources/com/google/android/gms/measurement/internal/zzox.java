package com.google.android.gms.measurement.internal;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzox implements zzgw {
    final /* synthetic */ String zza;
    final /* synthetic */ zzpj zzb;
    final /* synthetic */ zzpg zzc;

    zzox(zzpg zzpgVar, String str, zzpj zzpjVar) {
        this.zza = str;
        this.zzb = zzpjVar;
        Objects.requireNonNull(zzpgVar);
        this.zzc = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void zza(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.zzc.zzQ(this.zza, i10, th2, bArr, this.zzb);
    }
}
