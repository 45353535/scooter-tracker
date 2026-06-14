package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhpe extends zzibr implements zzidd {
    private static final zzhpe zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhpg zzb;
    private int zzc;

    static {
        zzhpe zzhpeVar = new zzhpe();
        zzd = zzhpeVar;
        zzibr.zzbu(zzhpe.class, zzhpeVar);
    }

    private zzhpe() {
    }

    public static zzhpe zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpe) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhpd zzc() {
        return (zzhpd) zzd.zzbn();
    }

    public final zzhpg zza() {
        zzhpg zzhpgVar = this.zzb;
        return zzhpgVar == null ? zzhpg.zzc() : zzhpgVar;
    }

    final /* synthetic */ void zzd(zzhpg zzhpgVar) {
        zzhpgVar.getClass();
        this.zzb = zzhpgVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhpe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpd(bArr);
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
        synchronized (zzhpe.class) {
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
}
