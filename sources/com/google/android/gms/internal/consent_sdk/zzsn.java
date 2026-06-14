package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsn extends zzqm implements zzrr {
    private static final zzsn zzb;
    private long zzd;
    private int zze;

    static {
        zzsn zzsnVar = new zzsn();
        zzb = zzsnVar;
        zzqm.zzz(zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzrz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzsn();
        }
        zzsm zzsmVar = null;
        if (i11 == 4) {
            return new zzsl(zzsmVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
