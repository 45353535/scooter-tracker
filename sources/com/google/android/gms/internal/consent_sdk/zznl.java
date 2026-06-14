package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zznl extends zzqm implements zzrr {
    private static final zznl zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zznl zznlVar = new zznl();
        zzb = zznlVar;
        zzqm.zzz(zznl.class, zznlVar);
    }

    private zznl() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zznj.zza, "zzf", zznk.zza});
        }
        if (i11 == 3) {
            return new zznl();
        }
        zzno zznoVar = null;
        if (i11 == 4) {
            return new zzni(zznoVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
