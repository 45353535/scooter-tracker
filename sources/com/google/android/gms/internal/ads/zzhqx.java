package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhqx extends zzibr implements zzidd {
    private static final zzhqx zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzhqf zzc;

    static {
        zzhqx zzhqxVar = new zzhqx();
        zzd = zzhqxVar;
        zzibr.zzbu(zzhqx.class, zzhqxVar);
    }

    private zzhqx() {
    }

    public static zzhqx zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqx) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqw zzd() {
        return (zzhqw) zzd.zzbn();
    }

    public static zzhqx zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhqf zzb() {
        zzhqf zzhqfVar = this.zzc;
        return zzhqfVar == null ? zzhqf.zzh() : zzhqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqw(bArr);
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
        synchronized (zzhqx.class) {
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

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzh(zzhqf zzhqfVar) {
        zzhqfVar.getClass();
        this.zzc = zzhqfVar;
        this.zza |= 1;
    }
}
