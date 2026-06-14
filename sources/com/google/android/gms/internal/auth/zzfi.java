package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes8.dex */
final class zzfi extends zzfk {
    /* synthetic */ zzfi(zzfh zzfhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    final void zza(Object obj, long j10) {
        ((zzey) zzhi.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    final void zzb(Object obj, Object obj2, long j10) {
        zzey zzeyVarZzd = (zzey) zzhi.zzf(obj, j10);
        zzey zzeyVar = (zzey) zzhi.zzf(obj2, j10);
        int size = zzeyVarZzd.size();
        int size2 = zzeyVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzeyVarZzd.zzc()) {
                zzeyVarZzd = zzeyVarZzd.zzd(size2 + size);
            }
            zzeyVarZzd.addAll(zzeyVar);
        }
        if (size > 0) {
            zzeyVar = zzeyVarZzd;
        }
        zzhi.zzp(obj, j10, zzeyVar);
    }

    private zzfi() {
        super(null);
    }
}
