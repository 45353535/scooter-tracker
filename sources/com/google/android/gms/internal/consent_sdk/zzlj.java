package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlj extends zzqm implements zzrr {
    private static final zzlj zzb;
    private int zzd;
    private int zze;
    private zzlh zzf;
    private zzlf zzg;

    static {
        zzlj zzljVar = new zzlj();
        zzb = zzljVar;
        zzqm.zzz(zzlj.class, zzljVar);
    }

    private zzlj() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzlc.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzlj();
        }
        zzli zzliVar = null;
        if (i11 == 4) {
            return new zzlb(zzliVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
