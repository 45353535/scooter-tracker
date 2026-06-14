package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzawq extends zzibr implements zzidd {
    private static final zzawq zze;
    private static volatile zzidk zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;
    private int zzd = 1000;

    static {
        zzawq zzawqVar = new zzawq();
        zze = zzawqVar;
        zzibr.zzbu(zzawq.class, zzawqVar);
    }

    private zzawq() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzibx zzibxVar = zzaxo.zza;
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", zzibxVar, "zzd", zzibxVar});
        }
        if (iOrdinal == 3) {
            return new zzawq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawp(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzawq.class) {
            try {
                zzibmVar = zzf;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zze);
                    zzf = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
