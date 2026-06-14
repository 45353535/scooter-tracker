package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhx extends zzfu implements zzhc {
    private static final zzhx zzb;
    private zzgv zzd = zzgv.zza();

    static {
        zzhx zzhxVar = new zzhx();
        zzb = zzhxVar;
        zzfu.zzB(zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    public static zzhu zza() {
        return (zzhu) zzb.zzp();
    }

    static /* synthetic */ Map zzc(zzhx zzhxVar) {
        if (!zzhxVar.zzd.zze()) {
            zzhxVar.zzd = zzhxVar.zzd.zzb();
        }
        return zzhxVar.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzhk(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", zzhv.zza});
        }
        if (i11 == 3) {
            return new zzhx();
        }
        zzhw zzhwVar = null;
        if (i11 == 4) {
            return new zzhu(zzhwVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
