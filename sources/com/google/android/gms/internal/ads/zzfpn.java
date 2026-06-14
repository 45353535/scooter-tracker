package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpn extends zzibr implements zzidd {
    private static final zzfpn zzg;
    private static volatile zzidk zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        zzfpn zzfpnVar = new zzfpn();
        zzg = zzfpnVar;
        zzibr.zzbu(zzfpn.class, zzfpnVar);
    }

    private zzfpn() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfpn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpm(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzh;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzfpn.class) {
            try {
                zzibmVar = zzh;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzg);
                    zzh = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
