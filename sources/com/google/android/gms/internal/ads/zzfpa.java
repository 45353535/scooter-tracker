package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpa extends zzibr implements zzidd {
    private static final zzfpa zzb;
    private static volatile zzidk zzc;
    private String zza = "";

    static {
        zzfpa zzfpaVar = new zzfpa();
        zzb = zzfpaVar;
        zzibr.zzbu(zzfpa.class, zzfpaVar);
    }

    private zzfpa() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzfpa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfoz(bArr);
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
        synchronized (zzfpa.class) {
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
