package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkc extends zzfu implements zzhc {
    private static final zzkc zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzkc zzkcVar = new zzkc();
        zzb = zzkcVar;
        zzfu.zzB(zzkc.class, zzkcVar);
    }

    private zzkc() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzkb.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzkc();
        }
        zzkd zzkdVar = null;
        if (i11 == 4) {
            return new zzka(zzkdVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
