package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzigf extends zzibr implements zzidd {
    private static final zzigf zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        zzigf zzigfVar = new zzigf();
        zzf = zzigfVar;
        zzibr.zzbu(zzigf.class, zzigfVar);
    }

    private zzigf() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzige.zza, "zzc", zzigc.zza, "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzigf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigd(bArr);
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
        synchronized (zzigf.class) {
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
