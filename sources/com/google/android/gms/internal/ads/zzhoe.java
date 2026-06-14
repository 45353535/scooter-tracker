package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhoe extends zzibr implements zzidd {
    private static final zzhoe zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhoi zzb;
    private zzhpx zzc;

    static {
        zzhoe zzhoeVar = new zzhoe();
        zzd = zzhoeVar;
        zzibr.zzbu(zzhoe.class, zzhoeVar);
    }

    private zzhoe() {
    }

    public static zzhoe zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoe) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhod zzd() {
        return (zzhod) zzd.zzbn();
    }

    public final zzhoi zza() {
        zzhoi zzhoiVar = this.zzb;
        return zzhoiVar == null ? zzhoi.zzd() : zzhoiVar;
    }

    public final zzhpx zzb() {
        zzhpx zzhpxVar = this.zzc;
        return zzhpxVar == null ? zzhpx.zzg() : zzhpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhoe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhod(bArr);
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
        synchronized (zzhoe.class) {
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

    final /* synthetic */ void zze(zzhoi zzhoiVar) {
        zzhoiVar.getClass();
        this.zzb = zzhoiVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhpx zzhpxVar) {
        zzhpxVar.getClass();
        this.zzc = zzhpxVar;
        this.zza |= 2;
    }
}
