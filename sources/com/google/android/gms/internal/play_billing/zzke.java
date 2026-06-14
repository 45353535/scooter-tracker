package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzke extends zzfu implements zzhc {
    private static final zzke zzb;
    private int zzd;
    private zzfz zze = zzfu.zzv();
    private String zzf = "";
    private boolean zzg;

    static {
        zzke zzkeVar = new zzke();
        zzb = zzkeVar;
        zzfu.zzB(zzke.class, zzkeVar);
    }

    private zzke() {
    }

    public static zzke zzb() {
        return zzb;
    }

    static /* synthetic */ void zzc(zzke zzkeVar, boolean z10) {
        zzkeVar.zzd |= 2;
        zzkeVar.zzg = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzkc.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzke();
        }
        zzkd zzkdVar = null;
        if (i11 == 4) {
            return new zzjz(zzkdVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
