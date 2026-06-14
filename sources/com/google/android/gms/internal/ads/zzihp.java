package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzihp extends zzibr implements zzidd {
    private static final zzihp zzf;
    private static volatile zzidk zzg;
    private int zza;
    private String zzb = "";
    private zzicd zzc = zzibr.zzbM();
    private zzicd zzd = zzibr.zzbM();
    private String zze = "";

    static {
        zzihp zzihpVar = new zzihp();
        zzf = zzihpVar;
        zzibr.zzbu(zzihp.class, zzihpVar);
    }

    private zzihp() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzihp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziho(bArr);
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
        synchronized (zzihp.class) {
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
