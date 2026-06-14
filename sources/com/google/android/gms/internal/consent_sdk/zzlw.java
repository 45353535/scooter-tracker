package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlw extends zzqm implements zzrr {
    private static final zzlw zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzlw zzlwVar = new zzlw();
        zzb = zzlwVar;
        zzqm.zzz(zzlw.class, zzlwVar);
    }

    private zzlw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzlw();
        }
        zzly zzlyVar = null;
        if (i11 == 4) {
            return new zzlv(zzlyVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
