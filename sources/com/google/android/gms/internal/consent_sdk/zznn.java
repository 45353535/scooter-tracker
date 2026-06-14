package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zznn extends zzqm implements zzrr {
    private static final zznn zzb;
    private zzqq zzd = zzqm.zzs();

    static {
        zznn zznnVar = new zznn();
        zzb = zznnVar;
        zzqm.zzz(zznn.class, zznnVar);
    }

    private zznn() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zznd.zza});
        }
        if (i11 == 3) {
            return new zznn();
        }
        zzno zznoVar = null;
        if (i11 == 4) {
            return new zznm(zznoVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
