package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfoy extends zzibr implements zzidd {
    private static final zzfoy zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzicd zzb = zzibr.zzbM();
    private zzifd zzc;

    static {
        zzfoy zzfoyVar = new zzfoy();
        zzd = zzfoyVar;
        zzibr.zzbu(zzfoy.class, zzfoyVar);
    }

    private zzfoy() {
    }

    public static zzfov zzb() {
        return (zzfov) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb.size();
    }

    final /* synthetic */ void zzc(zzfox zzfoxVar) {
        zzfoxVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzfoxVar);
    }

    final /* synthetic */ void zzd() {
        this.zzb = zzibr.zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfox.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfoy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfov(bArr);
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
        synchronized (zzfoy.class) {
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
