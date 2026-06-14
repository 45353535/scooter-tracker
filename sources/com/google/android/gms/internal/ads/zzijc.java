package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzijc extends zzibr implements zzidd {
    private static final zzijc zzl;
    private static volatile zzidk zzm;
    private int zza;
    private long zzd;
    private zzije zzi;
    private zzijg zzj;
    private zzhyi zzk;
    private zzian zzb = zzian.zza;
    private zzibz zzc = zzibr.zzbC();
    private zzibz zze = zzibr.zzbC();
    private zzicd zzf = zzibr.zzbM();
    private String zzg = "";
    private zzicd zzh = zzibr.zzbM();

    static {
        zzijc zzijcVar = new zzijc();
        zzl = zzijcVar;
        zzibr.zzbu(zzijc.class, zzijcVar);
    }

    private zzijc() {
    }

    public static zzijc zzc(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzijc) zzibr.zzbV(zzl, bArr, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zziir.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzijc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijb(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzm;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzijc.class) {
            try {
                zzibmVar = zzm;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzl);
                    zzm = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
