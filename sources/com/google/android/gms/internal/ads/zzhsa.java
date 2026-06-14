package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhsa extends zzibr implements zzidd {
    private static final zzhsa zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhsa zzhsaVar = new zzhsa();
        zzb = zzhsaVar;
        zzibr.zzbu(zzhsa.class, zzhsaVar);
    }

    private zzhsa() {
    }

    public static zzhsa zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhsa) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhsa zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhsa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrz(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhsa.class) {
            try {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
