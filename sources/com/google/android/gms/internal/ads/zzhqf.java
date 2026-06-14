package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhqf extends zzibr implements zzidd {
    private static final zzhqf zzd;
    private static volatile zzidk zze;
    private String zza = "";
    private zzian zzb = zzian.zza;
    private int zzc;

    static {
        zzhqf zzhqfVar = new zzhqf();
        zzd = zzhqfVar;
        zzibr.zzbu(zzhqf.class, zzhqfVar);
    }

    private zzhqf() {
    }

    public static zzhqf zzd(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzhqf) zzibr.zzbV(zzd, bArr, zzibbVar);
    }

    public static zzhqe zze() {
        return (zzhqe) zzd.zzbn();
    }

    public static zzhqe zzg(zzhqf zzhqfVar) {
        return (zzhqe) zzd.zzbo(zzhqfVar);
    }

    public static zzhqf zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final zzhqy zzc() {
        zzhqy zzhqyVarZzb = zzhqy.zzb(this.zzc);
        return zzhqyVarZzb == null ? zzhqy.UNRECOGNIZED : zzhqyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqe(bArr);
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
        synchronized (zzhqf.class) {
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

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzj(zzian zzianVar) {
        zzianVar.getClass();
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zzk(zzhqy zzhqyVar) {
        this.zzc = zzhqyVar.zza();
    }
}
