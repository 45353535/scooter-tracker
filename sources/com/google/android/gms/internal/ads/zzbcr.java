package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcr extends zzibr implements zzidd {
    private static final zzbcr zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzbcr zzbcrVar = new zzbcr();
        zzd = zzbcrVar;
        zzibr.zzbu(zzbcr.class, zzbcrVar);
    }

    private zzbcr() {
    }

    public static zzbcr zzc() {
        return zzd;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbcr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbcq(bArr);
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
        synchronized (zzbcr.class) {
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
