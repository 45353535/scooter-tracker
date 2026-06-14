package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlt extends zzqm implements zzrr {
    private static final zzlt zzb;

    static {
        zzlt zzltVar = new zzlt();
        zzb = zzltVar;
        zzqm.zzz(zzlt.class, zzltVar);
    }

    private zzlt() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzly zzlyVar = null;
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzlt();
        }
        if (i11 == 4) {
            return new zzls(zzlyVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
