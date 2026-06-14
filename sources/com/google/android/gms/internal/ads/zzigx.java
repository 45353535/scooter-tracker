package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzigx extends zzibr implements zzidd {
    private static final zzigx zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzigx zzigxVar = new zzigx();
        zzf = zzigxVar;
        zzibr.zzbu(zzigx.class, zzigxVar);
    }

    private zzigx() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzigw.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzigx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigv(bArr);
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
        synchronized (zzigx.class) {
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
