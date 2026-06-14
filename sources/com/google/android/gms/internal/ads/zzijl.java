package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzijl extends zzibr implements zzidd {
    private static final zzijl zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzicd zzc = zzibr.zzbM();

    static {
        zzijl zzijlVar = new zzijl();
        zzd = zzijlVar;
        zzibr.zzbu(zzijl.class, zzijlVar);
    }

    private zzijl() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", zzijj.class});
        }
        if (iOrdinal == 3) {
            return new zzijl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijk(bArr);
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
        synchronized (zzijl.class) {
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
