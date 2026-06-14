package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavi extends zzibr implements zzidd {
    private static final zzavi zzj;
    private static volatile zzidk zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzavz zzg;
    private zzawf zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzavi zzaviVar = new zzavi();
        zzj = zzaviVar;
        zzibr.zzbu(zzavi.class, zzaviVar);
    }

    private zzavi() {
    }

    public static zzavh zze() {
        return (zzavh) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzavz zzc() {
        zzavz zzavzVar = this.zzg;
        return zzavzVar == null ? zzavz.zzg() : zzavzVar;
    }

    public final zzawf zzd() {
        zzawf zzawfVar = this.zzh;
        return zzawfVar == null ? zzawf.zza() : zzawfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzavl.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzavi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavh(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzk;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzavi.class) {
            try {
                zzibmVar = zzk;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzj);
                    zzk = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z10) {
        this.zza |= 8;
        this.zze = z10;
    }
}
