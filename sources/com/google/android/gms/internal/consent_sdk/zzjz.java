package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjz extends zzqm implements zzrr {
    private static final zzjz zzb;
    private int zzd;
    private int zze;
    private zzjx zzf;

    static {
        zzjz zzjzVar = new zzjz();
        zzb = zzjzVar;
        zzqm.zzz(zzjz.class, zzjzVar);
    }

    private zzjz() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzjy.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzjz();
        }
        zzkb zzkbVar = null;
        if (i11 == 4) {
            return new zzjt(zzkbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
