package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjy extends zzfu implements zzhc {
    private static final zzjy zzb;
    private int zzd;
    private int zze;

    static {
        zzjy zzjyVar = new zzjy();
        zzb = zzjyVar;
        zzfu.zzB(zzjy.class, zzjyVar);
    }

    private zzjy() {
    }

    public static zzjv zza() {
        return (zzjv) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzjy zzjyVar, int i10) {
        zzjyVar.zze = i10 - 1;
        zzjyVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzjw.zza});
        }
        if (i11 == 3) {
            return new zzjy();
        }
        zzjx zzjxVar = null;
        if (i11 == 4) {
            return new zzjv(zzjxVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
