package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzju extends zzfu implements zzhc {
    private static final zzju zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzju zzjuVar = new zzju();
        zzb = zzjuVar;
        zzfu.zzB(zzju.class, zzjuVar);
    }

    private zzju() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzju();
        }
        zzjt zzjtVar = null;
        if (i11 == 4) {
            return new zzjs(zzjtVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
