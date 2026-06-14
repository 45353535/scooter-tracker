package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpe extends zzibr implements zzidd {
    private static final zzfpe zzc;
    private static volatile zzidk zzd;
    private String zza = "";
    private int zzb;

    static {
        zzfpe zzfpeVar = new zzfpe();
        zzc = zzfpeVar;
        zzibr.zzbu(zzfpe.class, zzfpeVar);
    }

    private zzfpe() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfpe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpd(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzfpe.class) {
            try {
                zzibmVar = zzd;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzc);
                    zzd = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
