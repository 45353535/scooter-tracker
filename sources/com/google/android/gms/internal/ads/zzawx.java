package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzawx extends zzibr implements zzidd {
    private static final zzawx zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzawx zzawxVar = new zzawx();
        zzd = zzawxVar;
        zzibr.zzbu(zzawx.class, zzawxVar);
    }

    private zzawx() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzawk.zza, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzawx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaww(bArr);
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
        synchronized (zzawx.class) {
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
