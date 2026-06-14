package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zziij extends zzibr implements zzidd {
    private static final zziij zzp;
    private static volatile zzidk zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzicd zze = zzibr.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzicd zzj = zzibr.zzbM();

    static {
        zziij zziijVar = new zziij();
        zzp = zziijVar;
        zzibr.zzbu(zziij.class, zziijVar);
    }

    private zziij() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zziii.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zziih.class, "zzc", "zzk", zziif.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new zziij();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziie(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzu;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zziij.class) {
            try {
                zzibmVar = zzu;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzp);
                    zzu = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
