package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zziiw extends zzibr implements zzidd {
    private static final zziiw zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zziiu zzb;

    static {
        zziiw zziiwVar = new zziiw();
        zzc = zziiwVar;
        zzibr.zzbu(zziiw.class, zziiwVar);
    }

    private zziiw() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zziiw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziiv(bArr);
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
        synchronized (zziiw.class) {
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
