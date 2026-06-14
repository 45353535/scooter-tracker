package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgdm extends zzibr implements zzidd {
    private static final zzgdm zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzicd zzb = zzibr.zzbM();
    private zzifd zzc;

    static {
        zzgdm zzgdmVar = new zzgdm();
        zzd = zzgdmVar;
        zzibr.zzbu(zzgdm.class, zzgdmVar);
    }

    private zzgdm() {
    }

    public static zzgdl zza() {
        return (zzgdl) zzd.zzbn();
    }

    final /* synthetic */ void zzb(zzgdk zzgdkVar) {
        zzgdkVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzgdkVar);
    }

    final /* synthetic */ void zzc(zzifd zzifdVar) {
        zzifdVar.getClass();
        this.zzc = zzifdVar;
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
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzgdk.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgdm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgdl(bArr);
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
        synchronized (zzgdm.class) {
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
