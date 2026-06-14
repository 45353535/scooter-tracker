package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzihs extends zzibr implements zzidd {
    private static final zzihs zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzihs zzihsVar = new zzihs();
        zzd = zzihsVar;
        zzibr.zzbu(zzihs.class, zzihsVar);
    }

    private zzihs() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzibx zzibxVar = zzihr.zza;
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", zzibxVar, "zzc", zzibxVar});
        }
        if (iOrdinal == 3) {
            return new zzihs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihq(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzihs.class) {
            try {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
