package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzew extends zzqm implements zzrr {
    private static final zzew zzb;
    private int zzd;
    private zzet zze;
    private zzev zzf;

    static {
        zzew zzewVar = new zzew();
        zzb = zzewVar;
        zzqm.zzz(zzew.class, zzewVar);
    }

    private zzew() {
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
            return new zzew();
        }
        zzez zzezVar = null;
        if (i11 == 4) {
            return new zzem(zzezVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
