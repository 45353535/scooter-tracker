package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgmp implements zzikg {
    private final zzikp zza;

    private zzgmp(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgmp zza(zzikp zzikpVar) {
        return new zzgmp(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pmtd");
    }
}
