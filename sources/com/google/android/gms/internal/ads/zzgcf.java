package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgcf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgcf(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgcf zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgcf(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgbf zzgbfVar = (zzgbf) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        sb2.append("Mozilla/5.0 (Linux; Android ");
        sb2.append(str);
        sb2.append("; ");
        sb2.append(str2);
        sb2.append(")");
        return new zzgck(executorService, sb2.toString(), zzgbfVar.zzl());
    }
}
