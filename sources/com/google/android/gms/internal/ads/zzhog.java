package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhog extends zzibr implements zzidd {
    private static final zzhog zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhok zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhog zzhogVar = new zzhog();
        zze = zzhogVar;
        zzibr.zzbu(zzhog.class, zzhogVar);
    }

    private zzhog() {
    }

    public static zzhof zzd() {
        return (zzhof) zze.zzbn();
    }

    public static zzhog zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhok zzb() {
        zzhok zzhokVar = this.zzc;
        return zzhokVar == null ? zzhok.zzc() : zzhokVar;
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
            return new zzhog();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhof(bArr);
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
        synchronized (zzhog.class) {
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

    final /* synthetic */ void zzg(zzhok zzhokVar) {
        zzhokVar.getClass();
        this.zzc = zzhokVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
