package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhqk extends zzibr implements zzidd {
    private static final zzhqk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzhqc zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhqk zzhqkVar = new zzhqk();
        zzf = zzhqkVar;
        zzibr.zzbu(zzhqk.class, zzhqkVar);
    }

    private zzhqk() {
    }

    public static zzhqj zze() {
        return (zzhqj) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhqc zzb() {
        zzhqc zzhqcVar = this.zzb;
        return zzhqcVar == null ? zzhqc.zze() : zzhqcVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhqy zzd() {
        zzhqy zzhqyVarZzb = zzhqy.zzb(this.zze);
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
            return zzibr.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhqk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqj(bArr);
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
        synchronized (zzhqk.class) {
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

    final /* synthetic */ void zzg(zzhqc zzhqcVar) {
        zzhqcVar.getClass();
        this.zzb = zzhqcVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i10) {
        this.zzd = i10;
    }

    final /* synthetic */ void zzi(zzhqy zzhqyVar) {
        this.zze = zzhqyVar.zza();
    }

    public final int zzk() {
        int i10 = this.zzc;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    final /* synthetic */ void zzl(int i10) {
        this.zzc = zzhqd.zza(i10);
    }
}
