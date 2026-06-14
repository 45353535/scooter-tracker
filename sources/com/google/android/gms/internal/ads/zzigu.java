package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zzigu extends zzibr implements zzidd {
    private static final zzigu zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzigt zzc;
    private zzigt zzd;

    static {
        zzigu zziguVar = new zzigu();
        zze = zziguVar;
        zzibr.zzbu(zzigu.class, zziguVar);
    }

    private zzigu() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zza", "zzb", zzigr.zza, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzigu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigq(bArr);
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
        synchronized (zzigu.class) {
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
