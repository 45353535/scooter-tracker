package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcl extends zzibr implements zzidd {
    private static final zzbcl zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzbcn zzb;
    private zzian zzc = zzian.zza;

    static {
        zzbcl zzbclVar = new zzbcl();
        zzd = zzbclVar;
        zzibr.zzbu(zzbcl.class, zzbclVar);
    }

    private zzbcl() {
    }

    public static zzbcl zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbcn zzb() {
        zzbcn zzbcnVar = this.zzb;
        return zzbcnVar == null ? zzbcn.zzd() : zzbcnVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzian zzd() {
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
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbcl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbck(bArr);
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
        synchronized (zzbcl.class) {
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
