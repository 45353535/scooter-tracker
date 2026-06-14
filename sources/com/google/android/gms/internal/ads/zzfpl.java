package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpl extends zzibr implements zzidd {
    private static final zzfpl zzc;
    private static volatile zzidk zzd;
    private zzicd zza = zzibr.zzbM();
    private long zzb;

    static {
        zzfpl zzfplVar = new zzfpl();
        zzc = zzfplVar;
        zzibr.zzbu(zzfpl.class, zzfplVar);
    }

    private zzfpl() {
    }

    public static zzfpk zza() {
        return (zzfpk) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfod zzfodVar) {
        zzfodVar.getClass();
        zzicd zzicdVar = this.zza;
        if (!zzicdVar.zza()) {
            this.zza = zzibr.zzbN(zzicdVar);
        }
        this.zza.add(zzfodVar);
    }

    final /* synthetic */ void zzc(long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfod.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfpl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpk(bArr);
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
        synchronized (zzfpl.class) {
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
