package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbrh implements zzboh {
    final /* synthetic */ zzbro zza;
    private final zzboh zzb;

    public zzbrh(zzbro zzbroVar, zzboh zzbohVar) {
        Objects.requireNonNull(zzbroVar);
        this.zza = zzbroVar;
        this.zzb = zzbohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    final /* synthetic */ zzboh zzb() {
        return this.zzb;
    }
}
