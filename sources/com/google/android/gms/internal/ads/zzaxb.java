package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxb extends zzibr implements zzidd {
    private static final zzaxb zzd;
    private static volatile zzidk zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        zzaxb zzaxbVar = new zzaxb();
        zzd = zzaxbVar;
        zzibr.zzbu(zzaxb.class, zzaxbVar);
    }

    private zzaxb() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzaxo.zza});
        }
        if (iOrdinal == 3) {
            return new zzaxb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxa(bArr);
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
        synchronized (zzaxb.class) {
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
