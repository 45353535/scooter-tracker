package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzalz {
    public static void zza(zzama zzamaVar, zzame zzameVar, zzdr zzdrVar) {
        for (int i10 = 0; i10 < zzamaVar.zza(); i10++) {
            long jZzb = zzamaVar.zzb(i10);
            List listZzc = zzamaVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == zzamaVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzamaVar.zzb(i10 + 1) - zzamaVar.zzb(i10);
                if (jZzb2 > 0) {
                    zzdrVar.zza(new zzalx(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
