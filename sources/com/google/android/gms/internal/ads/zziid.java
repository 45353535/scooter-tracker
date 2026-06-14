package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zziid extends zzibr implements zzidd {
    private static final zziid zzh;
    private static volatile zzidk zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzibz zzd = zzibr.zzbC();
    private zzicd zzf = zzibr.zzbM();
    private zzian zzg = zzian.zza;

    static {
        zziid zziidVar = new zziid();
        zzh = zziidVar;
        zzibr.zzbu(zziid.class, zziidVar);
    }

    private zziid() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zziib.class, "zzg"});
        }
        if (iOrdinal == 3) {
            return new zziid();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziic(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzi;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zziid.class) {
            try {
                zzibmVar = zzi;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzh);
                    zzi = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
