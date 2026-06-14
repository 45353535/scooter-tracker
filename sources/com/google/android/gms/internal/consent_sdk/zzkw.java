package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkw extends zzqm implements zzrr {
    private static final zzkw zzb;
    private zzqq zzd = zzqm.zzs();

    static {
        zzkw zzkwVar = new zzkw();
        zzb = zzkwVar;
        zzqm.zzz(zzkw.class, zzkwVar);
    }

    private zzkw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zzkv.zza});
        }
        if (i11 == 3) {
            return new zzkw();
        }
        zzkz zzkzVar = null;
        if (i11 == 4) {
            return new zzku(zzkzVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
