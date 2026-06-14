package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoo extends zzqm implements zzrr {
    private static final zzoo zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzqq zzg = zzqm.zzs();

    static {
        zzoo zzooVar = new zzoo();
        zzb = zzooVar;
        zzqm.zzz(zzoo.class, zzooVar);
    }

    private zzoo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzqp zzqpVar = zzom.zza;
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzg", zzqpVar, "zzf", zzqpVar});
        }
        if (i11 == 3) {
            return new zzoo();
        }
        zzon zzonVar = null;
        if (i11 == 4) {
            return new zzol(zzonVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
