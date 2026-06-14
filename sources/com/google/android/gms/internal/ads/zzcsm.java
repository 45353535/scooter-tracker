package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzcsm implements zzboh {
    final /* synthetic */ zzcsn zza;

    zzcsm(zzcsn zzcsnVar) {
        Objects.requireNonNull(zzcsnVar);
        this.zza = zzcsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        zzcsn zzcsnVar = this.zza;
        if (zzcsnVar.zze(map)) {
            zzcsnVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzm();
                }
            });
        }
    }
}
