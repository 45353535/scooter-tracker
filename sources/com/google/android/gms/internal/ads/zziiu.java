package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zziiu extends zzibr implements zzidd {
    private static final zziiu zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private int zzc;

    static {
        zziiu zziiuVar = new zziiu();
        zzd = zziiuVar;
        zzibr.zzbu(zziiu.class, zziiuVar);
    }

    private zziiu() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzijh.zza});
        }
        if (iOrdinal == 3) {
            return new zziiu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziit(bArr);
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
        synchronized (zziiu.class) {
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
