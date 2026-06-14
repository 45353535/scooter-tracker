package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
final class zzrg implements zzro {
    private final zzro[] zza;

    zzrg(zzro... zzroVarArr) {
        this.zza = zzroVarArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final zzrn zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzro zzroVar = this.zza[i10];
            if (zzroVar.zzc(cls)) {
                return zzroVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
