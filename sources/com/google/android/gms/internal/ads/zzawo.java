package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzawo extends zzibr implements zzidd {
    private static final zzawo zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb = 1000;
    private int zzc = 1000;
    private int zzd = 1000;
    private int zze = 1000;

    static {
        zzawo zzawoVar = new zzawo();
        zzf = zzawoVar;
        zzibr.zzbu(zzawo.class, zzawoVar);
    }

    private zzawo() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzibx zzibxVar = zzaxo.zza;
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", zzibxVar, "zzc", zzibxVar, "zzd", zzibxVar, "zze", zzibxVar});
        }
        if (iOrdinal == 3) {
            return new zzawo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawn(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzawo.class) {
            try {
                zzibmVar = zzg;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzf);
                    zzg = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
