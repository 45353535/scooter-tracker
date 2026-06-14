package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavz extends zzibr implements zzidd {
    private static final zzavz zzg;
    private static volatile zzidk zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzavz zzavzVar = new zzavz();
        zzg = zzavzVar;
        zzibr.zzbu(zzavz.class, zzavzVar);
    }

    private zzavz() {
    }

    public static zzavz zzg() {
        return zzg;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzavz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavy(bArr);
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
        synchronized (zzavz.class) {
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

    public final boolean zze() {
        return this.zzf;
    }
}
