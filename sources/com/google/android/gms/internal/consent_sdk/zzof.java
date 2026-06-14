package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzof extends zzqm implements zzrr {
    private static final zzof zzb;
    private int zzd;
    private long zze;

    static {
        zzof zzofVar = new zzof();
        zzb = zzofVar;
        zzqm.zzz(zzof.class, zzofVar);
    }

    private zzof() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzof();
        }
        zzog zzogVar = null;
        if (i11 == 4) {
            return new zzoe(zzogVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
