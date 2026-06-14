package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgds extends zzibr implements zzidd {
    private static final zzgds zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzgdu zzb;
    private zzian zzc;
    private zzian zzd;
    private int zze;

    static {
        zzgds zzgdsVar = new zzgds();
        zzf = zzgdsVar;
        zzibr.zzbu(zzgds.class, zzgdsVar);
    }

    private zzgds() {
        zzian zzianVar = zzian.zza;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
    }

    public static zzgdr zzd() {
        return (zzgdr) zzf.zzbn();
    }

    public final zzgdu zza() {
        zzgdu zzgduVar = this.zzb;
        return zzgduVar == null ? zzgdu.zzg() : zzgduVar;
    }

    public final zzian zzb() {
        return this.zzc;
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
            return zzibr.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzgei.zza});
        }
        if (iOrdinal == 3) {
            return new zzgds();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgdr(bArr);
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
        synchronized (zzgds.class) {
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

    final /* synthetic */ void zze(zzgdu zzgduVar) {
        zzgduVar.getClass();
        this.zzb = zzgduVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzian zzianVar) {
        zzianVar.getClass();
        this.zza |= 2;
        this.zzc = zzianVar;
    }

    final /* synthetic */ void zzh(zzian zzianVar) {
        zzianVar.getClass();
        this.zza |= 4;
        this.zzd = zzianVar;
    }

    public final int zzj() {
        int iZza = zzgej.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    final /* synthetic */ void zzk(int i10) {
        this.zze = i10 - 1;
        this.zza |= 8;
    }
}
