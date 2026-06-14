package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpt extends zzibr implements zzidd {
    private static final zzfpt zze;
    private static volatile zzidk zzf;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzfpt zzfptVar = new zzfpt();
        zze = zzfptVar;
        zzibr.zzbu(zzfpt.class, zzfptVar);
    }

    private zzfpt() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzfpt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfps(bArr);
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
        synchronized (zzfpt.class) {
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
