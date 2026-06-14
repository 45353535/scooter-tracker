package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhoc extends zzibr implements zzidd {
    private static final zzhoc zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhog zzc;
    private zzhpv zzd;

    static {
        zzhoc zzhocVar = new zzhoc();
        zze = zzhocVar;
        zzibr.zzbu(zzhoc.class, zzhocVar);
    }

    private zzhoc() {
    }

    public static zzhoc zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoc) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhob zze() {
        return (zzhob) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhog zzb() {
        zzhog zzhogVar = this.zzc;
        return zzhogVar == null ? zzhog.zze() : zzhogVar;
    }

    public final zzhpv zzc() {
        zzhpv zzhpvVar = this.zzd;
        return zzhpvVar == null ? zzhpv.zzg() : zzhpvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhoc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhob(bArr);
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
        synchronized (zzhoc.class) {
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

    final /* synthetic */ void zzh(zzhog zzhogVar) {
        zzhogVar.getClass();
        this.zzc = zzhogVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhpv zzhpvVar) {
        zzhpvVar.getClass();
        this.zzd = zzhpvVar;
        this.zza |= 2;
    }
}
