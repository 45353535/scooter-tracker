package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzic extends zzqm implements zzrr {
    private static final zzic zzb;
    private int zzd;
    private zzhx zze;
    private zzia zzf;

    static {
        zzic zzicVar = new zzic();
        zzb = zzicVar;
        zzqm.zzz(zzic.class, zzicVar);
    }

    private zzic() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzic();
        }
        zzib zzibVar = null;
        if (i11 == 4) {
            return new zzhm(zzibVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
