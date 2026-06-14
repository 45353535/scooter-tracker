package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcd extends zzibr implements zzidd {
    private static final zzbcd zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private zzian zzb = zzian.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbcd zzbcdVar = new zzbcd();
        zzh = zzbcdVar;
        zzibr.zzbu(zzbcd.class, zzbcdVar);
    }

    private zzbcd() {
    }

    public static zzbcc zza() {
        return (zzbcc) zzh.zzbn();
    }

    final /* synthetic */ void zzb(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zzc(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzbcd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbcc(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzi;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzbcd.class) {
            try {
                zzibmVar = zzi;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzh);
                    zzi = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}
