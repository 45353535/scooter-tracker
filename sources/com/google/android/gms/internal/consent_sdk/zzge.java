package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzge extends zzqm implements zzrr {
    private static final zzge zzb;
    private int zzd;
    private int zze;

    static {
        zzge zzgeVar = new zzge();
        zzb = zzgeVar;
        zzqm.zzz(zzge.class, zzgeVar);
    }

    private zzge() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzgd.zza});
        }
        if (i11 == 3) {
            return new zzge();
        }
        zzgf zzgfVar = null;
        if (i11 == 4) {
            return new zzgc(zzgfVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
