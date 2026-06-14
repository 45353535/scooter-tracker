package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzije extends zzibr implements zzidd {
    private static final zzije zzj;
    private static volatile zzidk zzk;
    private int zza;
    private zziin zzh;
    private String zzb = "";
    private String zzc = "";
    private zzicd zzd = zzibr.zzbM();
    private zzicd zze = zzibr.zzbM();
    private zzicd zzf = zzibr.zzbM();
    private int zzg = -1;
    private String zzi = "";

    static {
        zzije zzijeVar = new zzije();
        zzj = zzijeVar;
        zzibr.zzbu(zzije.class, zzijeVar);
    }

    private zzije() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zziir.class, "zze", zziiy.class, "zzg", "zzb", "zzf", zzijl.class, "zzi", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzije();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijd(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzk;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzije.class) {
            try {
                zzibmVar = zzk;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzj);
                    zzk = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
