package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpp extends zzibr implements zzidd {
    private static final zzfpp zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzc;
    private String zzb = "";
    private String zzd = "";

    static {
        zzfpp zzfppVar = new zzfpp();
        zze = zzfppVar;
        zzibr.zzbu(zzfpp.class, zzfppVar);
    }

    private zzfpp() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzfpp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpo(bArr);
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
        synchronized (zzfpp.class) {
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
