package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhpi extends zzibr implements zzidd {
    private static final zzhpi zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhpk zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhpi zzhpiVar = new zzhpi();
        zze = zzhpiVar;
        zzibr.zzbu(zzhpi.class, zzhpiVar);
    }

    private zzhpi() {
    }

    public static zzhpi zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpi) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhph zze() {
        return (zzhph) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhpk zzb() {
        zzhpk zzhpkVar = this.zzc;
        return zzhpkVar == null ? zzhpk.zzh() : zzhpkVar;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhpi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhph(bArr);
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
        synchronized (zzhpi.class) {
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

    final /* synthetic */ void zzh(zzhpk zzhpkVar) {
        zzhpkVar.getClass();
        this.zzc = zzhpkVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
