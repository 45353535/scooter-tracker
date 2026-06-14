package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhqo extends zzibr implements zzidd {
    private static final zzhqo zze;
    private static volatile zzidk zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhqo zzhqoVar = new zzhqo();
        zze = zzhqoVar;
        zzibr.zzbu(zzhqo.class, zzhqoVar);
    }

    private zzhqo() {
    }

    public static zzhqn zza() {
        return (zzhqn) zze.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(int i10) {
        this.zzc = i10;
    }

    final /* synthetic */ void zzd(zzhqy zzhqyVar) {
        this.zzd = zzhqyVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhqo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqn(bArr);
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
        synchronized (zzhqo.class) {
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

    final /* synthetic */ void zzg(int i10) {
        this.zzb = zzhqd.zza(i10);
    }
}
