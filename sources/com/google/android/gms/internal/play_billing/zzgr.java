package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
final class zzgr implements zzgz {
    private final zzgz[] zza;

    zzgr(zzgz... zzgzVarArr) {
        this.zza = zzgzVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final zzgy zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzgz zzgzVar = this.zza[i10];
            if (zzgzVar.zzc(cls)) {
                return zzgzVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
