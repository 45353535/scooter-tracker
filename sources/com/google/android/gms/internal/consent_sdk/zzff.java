package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzff extends zzqm implements zzrr {
    private static final zzff zzb;
    private int zzd;
    private zzfe zze;

    static {
        zzff zzffVar = new zzff();
        zzb = zzffVar;
        zzqm.zzz(zzff.class, zzffVar);
    }

    private zzff() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzff();
        }
        zzfg zzfgVar = null;
        if (i11 == 4) {
            return new zzfc(zzfgVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
