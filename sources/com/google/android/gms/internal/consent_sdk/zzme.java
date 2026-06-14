package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzme extends zzqm implements zzrr {
    private static final zzme zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzqq zzi = zzqm.zzs();
    private String zzj = "";
    private zzmc zzk;

    static {
        zzme zzmeVar = new zzme();
        zzb = zzmeVar;
        zzqm.zzz(zzme.class, zzmeVar);
    }

    private zzme() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ࠬ\u0006ဉ\u0005\u0007ለ\u0004", new Object[]{"zzd", "zze", "zzf", zzos.zza(), "zzg", zzow.zza(), "zzh", zzou.zza(), "zzi", zzoq.zza(), "zzk", "zzj"});
        }
        if (i11 == 3) {
            return new zzme();
        }
        zzmd zzmdVar = null;
        if (i11 == 4) {
            return new zzma(zzmdVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
