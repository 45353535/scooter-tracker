package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhpz extends zzibr implements zzidd {
    private static final zzhpz zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    static {
        zzhpz zzhpzVar = new zzhpz();
        zzc = zzhpzVar;
        zzibr.zzbu(zzhpz.class, zzhpzVar);
    }

    private zzhpz() {
    }

    public static zzhpy zzc() {
        return (zzhpy) zzc.zzbn();
    }

    public static zzhpz zzd() {
        return zzc;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhpz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpy(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhpz.class) {
            try {
                zzibmVar = zzd;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzc);
                    zzd = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zze(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    final /* synthetic */ void zzg(int i10) {
        this.zzb = i10;
    }
}
