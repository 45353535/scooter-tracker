package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcf extends zzibr implements zzidd {
    private static final zzbcf zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzbcl zzb;

    static {
        zzbcf zzbcfVar = new zzbcf();
        zzc = zzbcfVar;
        zzibr.zzbu(zzbcf.class, zzbcfVar);
    }

    private zzbcf() {
    }

    public static zzbcf zzb(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcf) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public final zzbcl zza() {
        zzbcl zzbclVar = this.zzb;
        return zzbclVar == null ? zzbcl.zze() : zzbclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzbcf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbce(bArr);
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
        synchronized (zzbcf.class) {
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
}
