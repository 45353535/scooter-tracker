package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavx extends zzibr implements zzidd {
    private static final zzavx zzh;
    private static volatile zzidk zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzavx zzavxVar = new zzavx();
        zzh = zzavxVar;
        zzibr.zzbu(zzavx.class, zzavxVar);
    }

    private zzavx() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzavx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavw(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzi;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzavx.class) {
            try {
                zzibmVar = zzi;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzh);
                    zzi = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
