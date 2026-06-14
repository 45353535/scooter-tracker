package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzod extends zzqm implements zzrr {
    private static final zzod zzb;
    private int zzd;
    private zzqr zze = zzqm.zzt();
    private zzsn zzf;

    static {
        zzod zzodVar = new zzod();
        zzb = zzodVar;
        zzqm.zzz(zzod.class, zzodVar);
    }

    private zzod() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zzoa.class, "zzf"});
        }
        if (i11 == 3) {
            return new zzod();
        }
        zzog zzogVar = null;
        if (i11 == 4) {
            return new zzny(zzogVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
