package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzdtc implements zzgzl {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    zzdtc(zzdtk zzdtkVar, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcjl) obj).zze(this.zza, this.zzb);
    }
}
