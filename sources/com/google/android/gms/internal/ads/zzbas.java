package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbas implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbat zza;

    zzbas(zzbat zzbatVar) {
        Objects.requireNonNull(zzbatVar);
        this.zza = zzbatVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            zzbat zzbatVar = this.zza;
            zzbatVar.zze(System.currentTimeMillis());
            zzbatVar.zzh(true);
            return;
        }
        zzbat zzbatVar2 = this.zza;
        long jZzf = zzbatVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbatVar2.zzf()) {
            zzbatVar2.zzg(jCurrentTimeMillis - zzbatVar2.zzf());
        }
        zzbatVar2.zzh(false);
    }
}
