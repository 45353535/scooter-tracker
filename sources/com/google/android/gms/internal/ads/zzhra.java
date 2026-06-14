package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zzhra extends zzibr implements zzidd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhra zzd;
    private static volatile zzidk zze;
    private String zzb = "";
    private zzicd zzc = zzibr.zzbM();

    static {
        zzhra zzhraVar = new zzhra();
        zzd = zzhraVar;
        zzibr.zzbu(zzhra.class, zzhraVar);
    }

    private zzhra() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhqh.class});
        }
        if (iOrdinal == 3) {
            return new zzhra();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqz(bArr);
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
        synchronized (zzhra.class) {
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
