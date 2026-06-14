package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavu extends zzibr implements zzidd {
    private static final zzavu zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb = 2;

    static {
        zzavu zzavuVar = new zzavu();
        zzc = zzavuVar;
        zzibr.zzbu(zzavu.class, zzavuVar);
    }

    private zzavu() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", zzavv.zza});
        }
        if (iOrdinal == 3) {
            return new zzavu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavt(bArr);
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
        synchronized (zzavu.class) {
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
