package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class zzglv implements zzikg {
    private final zzikp zza;

    private zzglv(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzglv zza(zzikp zzikpVar) {
        return new zzglv(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcbc");
    }
}
