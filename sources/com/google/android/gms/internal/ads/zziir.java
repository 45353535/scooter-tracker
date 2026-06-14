package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zziir extends zzibr implements zzidd {
    private static final zziir zzn;
    private static volatile zzidk zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zziiw zzk;
    private zziiq zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zziir zziirVar = new zziir();
        zzn = zziirVar;
        zzibr.zzbu(zziir.class, zziirVar);
    }

    private zziir() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzija.zza, "zze", zziiz.zza, "zzf", "zzg", "zzh", "zzi", "zzj", zziis.zza, "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zziir();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziio(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzo;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zziir.class) {
            try {
                zzibmVar = zzo;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzn);
                    zzo = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
