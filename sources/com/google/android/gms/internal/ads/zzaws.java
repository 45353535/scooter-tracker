package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaws extends zzibr implements zzidd {
    private static final zzaws zzc;
    private static volatile zzidk zzd;
    private int zza;
    private long zzb = -1;

    static {
        zzaws zzawsVar = new zzaws();
        zzc = zzawsVar;
        zzibr.zzbu(zzaws.class, zzawsVar);
    }

    private zzaws() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzaws();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawr(bArr);
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
        synchronized (zzaws.class) {
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
