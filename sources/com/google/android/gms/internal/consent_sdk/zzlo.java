package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlo extends zzqm implements zzrr {
    private static final zzlo zzb;
    private int zzd;
    private zzlm zze;

    static {
        zzlo zzloVar = new zzlo();
        zzb = zzloVar;
        zzqm.zzz(zzlo.class, zzloVar);
    }

    private zzlo() {
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
            return new zzlo();
        }
        zzln zzlnVar = null;
        if (i11 == 4) {
            return new zzlk(zzlnVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
