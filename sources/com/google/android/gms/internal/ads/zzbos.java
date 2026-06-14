package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbos implements com.google.android.gms.ads.internal.overlay.zzaa {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    zzbos(zzbou zzbouVar, boolean z10, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z10;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
        Objects.requireNonNull(zzbouVar);
        this.zza = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z10) {
        if (this.zza) {
            return;
        }
        if (z10 && this.zzb) {
            ((zzdjm) this.zzc).zzdu();
        }
        this.zza = true;
        Map map = this.zzd;
        map.put((String) this.zze.get("event_id"), Boolean.valueOf(z10));
        ((zzbrd) this.zzc).zze("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i10) {
    }
}
