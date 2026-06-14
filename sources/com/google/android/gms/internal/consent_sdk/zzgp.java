package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgp extends zzqm implements zzrr {
    private static final zzgp zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgp zzgpVar = new zzgp();
        zzb = zzgpVar;
        zzqm.zzz(zzgp.class, zzgpVar);
    }

    private zzgp() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzgo.zza, "zzf", zzgn.zza});
        }
        if (i11 == 3) {
            return new zzgp();
        }
        zzgq zzgqVar = null;
        if (i11 == 4) {
            return new zzgm(zzgqVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
