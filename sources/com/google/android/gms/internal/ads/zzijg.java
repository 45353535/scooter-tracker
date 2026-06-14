package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzijg extends zzibr implements zzidd {
    private static final zzijg zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private zzicd zze = zzibr.zzbM();

    static {
        zzijg zzijgVar = new zzijg();
        zzf = zzijgVar;
        zzibr.zzbu(zzijg.class, zzijgVar);
    }

    private zzijg() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzijg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijf(bArr);
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
        synchronized (zzijg.class) {
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
