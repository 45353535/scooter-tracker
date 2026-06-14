package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgny implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgoa zza;

    zzgny(zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgoaVar);
        this.zza = zzgoaVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        zzgoa zzgoaVar = this.zza;
        synchronized (zzgoaVar) {
            try {
                if (z10) {
                    zzgoaVar.zzg(System.currentTimeMillis());
                    zzgoaVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgoaVar.zzh() > 0 && jCurrentTimeMillis >= zzgoaVar.zzh()) {
                        zzgoaVar.zzi(jCurrentTimeMillis - zzgoaVar.zzh());
                    }
                    zzgoaVar.zzj(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
