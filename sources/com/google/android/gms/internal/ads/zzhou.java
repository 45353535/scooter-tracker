package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhou extends zzibr implements zzidd {
    private static final zzhou zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    static {
        zzhou zzhouVar = new zzhou();
        zzc = zzhouVar;
        zzibr.zzbu(zzhou.class, zzhouVar);
    }

    private zzhou() {
    }

    public static zzhou zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhou) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhot zzd() {
        return (zzhot) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
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
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhou();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhot(bArr);
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
        synchronized (zzhou.class) {
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

    final /* synthetic */ void zze(int i10) {
        this.zza = i10;
    }
}
