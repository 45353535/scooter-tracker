package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzifp extends zzibr implements zzidd {
    private static final zzifp zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzian zzd = zzian.zza;

    static {
        zzifp zzifpVar = new zzifp();
        zze = zzifpVar;
        zzibr.zzbu(zzifp.class, zzifpVar);
    }

    private zzifp() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzifo.zza, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzifp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzifn(bArr);
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
        synchronized (zzifp.class) {
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
