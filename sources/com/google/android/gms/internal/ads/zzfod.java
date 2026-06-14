package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfod extends zzibr implements zzidd {
    private static final zzfod zzc;
    private static volatile zzidk zzd;
    private int zza;
    private long zzb;

    static {
        zzfod zzfodVar = new zzfod();
        zzc = zzfodVar;
        zzibr.zzbu(zzfod.class, zzfodVar);
    }

    private zzfod() {
    }

    public static zzfoc zza() {
        return (zzfoc) zzc.zzbn();
    }

    final /* synthetic */ void zzb(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zza = i10 - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfod();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfoc(bArr);
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
        synchronized (zzfod.class) {
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
