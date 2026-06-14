package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzigt extends zzibr implements zzidd {
    private static final zzigt zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        zzigt zzigtVar = new zzigt();
        zze = zzigtVar;
        zzibr.zzbu(zzigt.class, zzigtVar);
    }

    private zzigt() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzibx zzibxVar = zzigr.zza;
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", zzibxVar, "zzc", "zzd", zzibxVar});
        }
        if (iOrdinal == 3) {
            return new zzigt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigs(bArr);
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
        synchronized (zzigt.class) {
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
