package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavs extends zzibr implements zzidd {
    private static final zzavs zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzavu zzb;
    private zzavx zzc;

    static {
        zzavs zzavsVar = new zzavs();
        zzd = zzavsVar;
        zzibr.zzbu(zzavs.class, zzavsVar);
    }

    private zzavs() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzavs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavr(bArr);
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
        synchronized (zzavs.class) {
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
