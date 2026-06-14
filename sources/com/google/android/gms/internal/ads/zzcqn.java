package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcqn implements zzcql {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcqn(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        this.zza.zzb(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
