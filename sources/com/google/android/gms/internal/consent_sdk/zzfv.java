package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfv extends zzqm implements zzrr {
    private static final zzfv zzb;
    private int zzd;
    private int zze;

    static {
        zzfv zzfvVar = new zzfv();
        zzb = zzfvVar;
        zzqm.zzz(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzft.zza});
        }
        if (i11 == 3) {
            return new zzfv();
        }
        zzfu zzfuVar = null;
        if (i11 == 4) {
            return new zzfs(zzfuVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
