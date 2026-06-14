package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcj extends zzibr implements zzidd {
    private static final zzbcj zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzbcp zzb;
    private zzian zzc;
    private zzian zzd;

    static {
        zzbcj zzbcjVar = new zzbcj();
        zze = zzbcjVar;
        zzibr.zzbu(zzbcj.class, zzbcjVar);
    }

    private zzbcj() {
        zzian zzianVar = zzian.zza;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
    }

    public static zzbcj zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzbcj zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbV(zze, bArr, zzibbVar);
    }

    public final zzbcp zza() {
        zzbcp zzbcpVar = this.zzb;
        return zzbcpVar == null ? zzbcp.zzj() : zzbcpVar;
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
            return zzibr.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzbcj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbci(bArr);
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
        synchronized (zzbcj.class) {
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
}
