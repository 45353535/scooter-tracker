package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhrm extends zzibr implements zzidd {
    private static final zzhrm zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhrm zzhrmVar = new zzhrm();
        zzd = zzhrmVar;
        zzibr.zzbu(zzhrm.class, zzhrmVar);
    }

    private zzhrm() {
    }

    public static zzhrl zzd() {
        return (zzhrl) zzd.zzbn();
    }

    public static zzhrm zze() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final zzhpt zzb() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zzb);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrl(bArr);
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
        synchronized (zzhrm.class) {
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

    final /* synthetic */ void zzg(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    final /* synthetic */ void zzh(zzhpt zzhptVar) {
        this.zzb = zzhptVar.zza();
    }

    final /* synthetic */ void zzi(int i10) {
        this.zzc = i10;
    }
}
