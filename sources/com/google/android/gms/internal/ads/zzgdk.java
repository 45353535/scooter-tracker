package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgdk extends zzibr implements zzidd {
    private static final zzgdk zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzavk zzb;

    static {
        zzgdk zzgdkVar = new zzgdk();
        zzc = zzgdkVar;
        zzibr.zzbu(zzgdk.class, zzgdkVar);
    }

    private zzgdk() {
    }

    public static zzgdj zza() {
        return (zzgdj) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzavk zzavkVar) {
        zzavkVar.getClass();
        this.zzb = zzavkVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzgdk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgdj(bArr);
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
        synchronized (zzgdk.class) {
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
