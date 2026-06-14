package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhpp extends zzibr implements zzidd {
    private static final zzhpp zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzian zzc = zzian.zza;
    private zzhpr zzd;

    static {
        zzhpp zzhppVar = new zzhpp();
        zze = zzhppVar;
        zzibr.zzbu(zzhpp.class, zzhppVar);
    }

    private zzhpp() {
    }

    public static zzhpp zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpp) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhpo zze() {
        return (zzhpo) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzhpr zzc() {
        zzhpr zzhprVar = this.zzd;
        return zzhprVar == null ? zzhpr.zze() : zzhprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhpp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpo(bArr);
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
        synchronized (zzhpp.class) {
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

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzc = zzianVar;
    }

    final /* synthetic */ void zzi(zzhpr zzhprVar) {
        zzhprVar.getClass();
        this.zzd = zzhprVar;
        this.zza |= 1;
    }
}
