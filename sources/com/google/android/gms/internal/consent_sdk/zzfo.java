package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfo extends zzqm implements zzrr {
    private static final zzfo zzb;
    private int zzd;
    private zzfm zze;
    private zzlj zzf;
    private int zzg;

    static {
        zzfo zzfoVar = new zzfo();
        zzb = zzfoVar;
        zzqm.zzz(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzg", zzig.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzfo();
        }
        zzfn zzfnVar = null;
        if (i11 == 4) {
            return new zzfi(zzfnVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
