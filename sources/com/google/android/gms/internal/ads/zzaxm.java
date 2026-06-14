package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxm extends zzibr implements zzidd {
    private static final zzaxm zze;
    private static volatile zzidk zzf;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;

    static {
        zzaxm zzaxmVar = new zzaxm();
        zze = zzaxmVar;
        zzibr.zzbu(zzaxm.class, zzaxmVar);
    }

    private zzaxm() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzaxm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxl(bArr);
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
        synchronized (zzaxm.class) {
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
