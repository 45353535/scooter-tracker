package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxk extends zzibr implements zzidd {
    private static final zzaxk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzian zzb;
    private zzian zzc;
    private zzian zzd;
    private zzian zze;

    static {
        zzaxk zzaxkVar = new zzaxk();
        zzf = zzaxkVar;
        zzibr.zzbu(zzaxk.class, zzaxkVar);
    }

    private zzaxk() {
        zzian zzianVar = zzian.zza;
        this.zzb = zzianVar;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
        this.zze = zzianVar;
    }

    public static zzaxk zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzaxk) zzibr.zzbV(zzf, bArr, zzibbVar);
    }

    public static zzaxj zzg() {
        return (zzaxj) zzf.zzbn();
    }

    public final zzian zza() {
        return this.zzb;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final zzian zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzaxk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxj(bArr);
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
        synchronized (zzaxk.class) {
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

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zzi(zzian zzianVar) {
        this.zza |= 2;
        this.zzc = zzianVar;
    }

    final /* synthetic */ void zzj(zzian zzianVar) {
        this.zza |= 4;
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzk(zzian zzianVar) {
        this.zza |= 8;
        this.zze = zzianVar;
    }
}
