package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zziiq extends zzibr implements zzidd {
    private static final zziiq zze;
    private static volatile zzidk zzf;
    private int zza;
    private String zzb = "";
    private boolean zzc;
    private boolean zzd;

    static {
        zziiq zziiqVar = new zziiq();
        zze = zziiqVar;
        zzibr.zzbu(zziiq.class, zziiqVar);
    }

    private zziiq() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zziiq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziip(bArr);
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
        synchronized (zziiq.class) {
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
