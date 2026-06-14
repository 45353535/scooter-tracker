package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpr extends zzibr implements zzidd {
    private static final zzfpr zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzibr.zzbM();

    static {
        zzfpr zzfprVar = new zzfpr();
        zzb = zzfprVar;
        zzibr.zzbu(zzfpr.class, zzfprVar);
    }

    private zzfpr() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfpp.class});
        }
        if (iOrdinal == 3) {
            return new zzfpr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpq(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzfpr.class) {
            try {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
