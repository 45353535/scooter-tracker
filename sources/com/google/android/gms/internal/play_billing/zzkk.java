package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkk extends zzfu implements zzhc {
    private static final zzkk zzb;
    private int zzd;
    private int zzf;
    private zzfz zze = zzfu.zzv();
    private String zzg = "";

    static {
        zzkk zzkkVar = new zzkk();
        zzb = zzkkVar;
        zzfu.zzB(zzkk.class, zzkkVar);
    }

    private zzkk() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzkk();
        }
        zzkj zzkjVar = null;
        if (i11 == 4) {
            return new zzki(zzkjVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
