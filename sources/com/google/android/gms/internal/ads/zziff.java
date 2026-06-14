package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zziff extends zzibr implements zzidd {
    private static final zziff zzc;
    private static volatile zzidk zzd;
    private zzibz zza = zzibr.zzbC();
    private zzibz zzb = zzibr.zzbC();

    static {
        zziff zziffVar = new zziff();
        zzc = zziffVar;
        zzibr.zzbu(zziff.class, zziffVar);
    }

    private zziff() {
    }

    public static zziff zzc(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zziff) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zziff();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzife(bArr);
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
        synchronized (zziff.class) {
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
