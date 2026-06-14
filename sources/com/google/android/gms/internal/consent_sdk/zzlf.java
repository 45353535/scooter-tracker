package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlf extends zzqm implements zzrr {
    private static final zzlf zzb;
    private int zzd;
    private zzrk zzh = zzrk.zza();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzqm.zzz(zzlf.class, zzlfVar);
    }

    private zzlf() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzle.zza});
        }
        if (i11 == 3) {
            return new zzlf();
        }
        zzli zzliVar = null;
        if (i11 == 4) {
            return new zzld(zzliVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
