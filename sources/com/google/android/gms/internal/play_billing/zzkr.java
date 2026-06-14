package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkr extends zzfu implements zzhc {
    private static final zzkr zzb;
    private int zzd;
    private int zze;

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzfu.zzB(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    public static zzkr zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkp.zza});
        }
        if (i11 == 3) {
            return new zzkr();
        }
        zzkq zzkqVar = null;
        if (i11 == 4) {
            return new zzko(zzkqVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
