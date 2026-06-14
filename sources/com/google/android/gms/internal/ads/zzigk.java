package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzigk extends zzibr implements zzidd {
    private static final zzigk zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzian zzb;
    private zzian zzc;
    private zzian zzd;

    static {
        zzigk zzigkVar = new zzigk();
        zze = zzigkVar;
        zzibr.zzbu(zzigk.class, zzigkVar);
    }

    private zzigk() {
        zzian zzianVar = zzian.zza;
        this.zzb = zzianVar;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzigk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigj(bArr);
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
        synchronized (zzigk.class) {
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
