package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzms extends zzqm implements zzrr {
    private static final zzms zzb;
    private int zzd;
    private int zze;

    static {
        zzms zzmsVar = new zzms();
        zzb = zzmsVar;
        zzqm.zzz(zzms.class, zzmsVar);
    }

    private zzms() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzmq.zza});
        }
        if (i11 == 3) {
            return new zzms();
        }
        zzmw zzmwVar = null;
        if (i11 == 4) {
            return new zzmr(zzmwVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
