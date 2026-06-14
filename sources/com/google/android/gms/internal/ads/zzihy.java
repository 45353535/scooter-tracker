package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzihy extends zzibr implements zzidd {
    private static final zzihy zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        zzihy zzihyVar = new zzihy();
        zzd = zzihyVar;
        zzibr.zzbu(zzihy.class, zzihyVar);
    }

    private zzihy() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", zzihx.zza, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzihy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihw(bArr);
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
        synchronized (zzihy.class) {
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
