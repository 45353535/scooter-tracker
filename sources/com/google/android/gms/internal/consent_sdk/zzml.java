package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzml extends zzqm implements zzrr {
    private static final zzml zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzml zzmlVar = new zzml();
        zzb = zzmlVar;
        zzqm.zzz(zzml.class, zzmlVar);
    }

    private zzml() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", zzmj.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzml();
        }
        zzmw zzmwVar = null;
        if (i11 == 4) {
            return new zzmk(zzmwVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
