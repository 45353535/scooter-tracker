package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxf extends zzibr implements zzidd {
    private static final zzaxf zzj;
    private static volatile zzidk zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzaxf zzaxfVar = new zzaxf();
        zzj = zzaxfVar;
        zzibr.zzbu(zzaxf.class, zzaxfVar);
    }

    private zzaxf() {
    }

    public static zzaxe zza() {
        return (zzaxe) zzj.zzbn();
    }

    final /* synthetic */ void zzb(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    final /* synthetic */ void zzc(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    final /* synthetic */ void zzd(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzaxf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxe(bArr);
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
        synchronized (zzaxf.class) {
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

    final /* synthetic */ void zze(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    final /* synthetic */ void zzg(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }
}
