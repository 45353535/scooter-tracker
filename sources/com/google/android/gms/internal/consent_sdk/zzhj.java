package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhj extends zzqm implements zzrr {
    private static final zzhj zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzhj zzhjVar = new zzhj();
        zzb = zzhjVar;
        zzqm.zzz(zzhj.class, zzhjVar);
    }

    private zzhj() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzhi.class, zzhg.class});
        }
        if (i11 == 3) {
            return new zzhj();
        }
        zzhk zzhkVar = null;
        if (i11 == 4) {
            return new zzhe(zzhkVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
