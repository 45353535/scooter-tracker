package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhyi extends zzibr implements zzidd {
    private static final zzhyi zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzian zzb = zzian.zza;
    private String zzc = "";
    private zzicd zzd = zzibr.zzbM();
    private boolean zze;

    static {
        zzhyi zzhyiVar = new zzhyi();
        zzf = zzhyiVar;
        zzibr.zzbu(zzhyi.class, zzhyiVar);
    }

    private zzhyi() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhyi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhyh(bArr);
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
        synchronized (zzhyi.class) {
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
