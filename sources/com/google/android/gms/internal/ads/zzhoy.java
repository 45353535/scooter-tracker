package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhoy extends zzibr implements zzidd {
    private static final zzhoy zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    static {
        zzhoy zzhoyVar = new zzhoy();
        zzc = zzhoyVar;
        zzibr.zzbu(zzhoy.class, zzhoyVar);
    }

    private zzhoy() {
    }

    public static zzhoy zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoy) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhox zzd() {
        return (zzhox) zzc.zzbn();
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
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iOrdinal == 3) {
            return new zzhoy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhox(bArr);
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
        synchronized (zzhoy.class) {
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
