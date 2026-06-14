package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzok extends zzqm implements zzrr {
    private static final zzok zzb;
    private int zzd;
    private int zze;

    static {
        zzok zzokVar = new zzok();
        zzb = zzokVar;
        zzqm.zzz(zzok.class, zzokVar);
    }

    private zzok() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzok();
        }
        zzoj zzojVar = null;
        if (i11 == 4) {
            return new zzoi(zzojVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
