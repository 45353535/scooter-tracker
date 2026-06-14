package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzics implements zzida {
    private final zzida[] zza;

    zzics(zzida... zzidaVarArr) {
        this.zza = zzidaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzicz zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzida zzidaVar = this.zza[i10];
            if (zzidaVar.zzb(cls)) {
                return zzidaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
