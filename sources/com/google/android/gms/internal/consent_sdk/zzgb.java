package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgb extends zzqm implements zzrr {
    private static final zzgb zzb;
    private int zzd;
    private zzgj zze;
    private boolean zzf;

    static {
        zzgb zzgbVar = new zzgb();
        zzb = zzgbVar;
        zzqm.zzz(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgb();
        }
        zzgf zzgfVar = null;
        if (i11 == 4) {
            return new zzga(zzgfVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
