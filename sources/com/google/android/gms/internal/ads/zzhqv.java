package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhqv extends zzibr implements zzidd {
    private static final zzhqv zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhqx zzc;

    static {
        zzhqv zzhqvVar = new zzhqv();
        zzd = zzhqvVar;
        zzibr.zzbu(zzhqv.class, zzhqvVar);
    }

    private zzhqv() {
    }

    public static zzhqv zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqv) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqu zzd() {
        return (zzhqu) zzd.zzbn();
    }

    public static zzidk zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqx zzb() {
        zzhqx zzhqxVar = this.zzc;
        return zzhqxVar == null ? zzhqx.zze() : zzhqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqu(bArr);
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
        synchronized (zzhqv.class) {
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

    final /* synthetic */ void zzg(zzhqx zzhqxVar) {
        zzhqxVar.getClass();
        this.zzc = zzhqxVar;
        this.zza |= 1;
    }
}
