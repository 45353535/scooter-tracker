package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpx extends zzibr implements zzidd {
    private static final zzfpx zzd;
    private static volatile zzidk zze;
    private long zza;
    private long zzb;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzfpx zzfpxVar = new zzfpx();
        zzd = zzfpxVar;
        zzibr.zzbu(zzfpx.class, zzfpxVar);
    }

    private zzfpx() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ț", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfpx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpw(bArr);
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
        synchronized (zzfpx.class) {
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
