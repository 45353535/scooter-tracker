package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxq extends zzibr implements zzidd {
    private static final zzaxq zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        zzaxq zzaxqVar = new zzaxq();
        zzh = zzaxqVar;
        zzibr.zzbu(zzaxq.class, zzaxqVar);
    }

    private zzaxq() {
    }

    public static zzaxp zza() {
        return (zzaxp) zzh.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzaxq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxp(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzi;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzaxq.class) {
            try {
                zzibmVar = zzi;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzh);
                    zzi = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    final /* synthetic */ void zzh(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }
}
