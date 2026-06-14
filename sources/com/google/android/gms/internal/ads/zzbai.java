package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbai implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbak zzb;

    zzbai(zzbak zzbakVar, int i10, boolean z10) {
        this.zza = i10;
        Objects.requireNonNull(zzbakVar);
        this.zzb = zzbakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaxg zzaxgVarZza;
        int i10 = this.zza;
        zzbak zzbakVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbakVar.zza;
            zzaxgVarZza = zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaxgVarZza = null;
        }
        zzbak zzbakVar2 = this.zzb;
        zzbakVar2.zzs(zzaxgVarZza);
        int i11 = this.zza;
        if (i11 < 4) {
            if (zzaxgVarZza != null && zzaxgVarZza.zza() && !zzaxgVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaxgVarZza.zzg() && zzaxgVarZza.zzh().zza() && zzaxgVarZza.zzh().zzb() != -2) {
                return;
            }
            zzbakVar2.zzp(i11 + 1, true);
        }
    }
}
