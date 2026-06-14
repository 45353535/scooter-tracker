package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzijj extends zzibr implements zzidd {
    private static final zzijj zze;
    private static volatile zzidk zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        zzijj zzijjVar = new zzijj();
        zze = zzijjVar;
        zzibr.zzbu(zzijj.class, zzijjVar);
    }

    private zzijj() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", zzijm.zza, "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzijj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziji(bArr);
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
        synchronized (zzijj.class) {
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
