package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcn extends zzibr implements zzidd {
    private static final zzbcn zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzbcr zzb;
    private zzian zzc = zzian.zza;
    private long zzd;
    private long zze;

    static {
        zzbcn zzbcnVar = new zzbcn();
        zzf = zzbcnVar;
        zzibr.zzbu(zzbcn.class, zzbcnVar);
    }

    private zzbcn() {
    }

    public static zzbcn zzd() {
        return zzf;
    }

    public final zzbcr zza() {
        zzbcr zzbcrVar = this.zzb;
        return zzbcrVar == null ? zzbcr.zzc() : zzbcrVar;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final long zzc() {
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
            return zzibr.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzbcn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbcm(bArr);
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
        synchronized (zzbcn.class) {
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
}
