package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavq extends zzibr implements zzidd {
    private static final zzavq zzo;
    private static volatile zzidk zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private zzicd zzm = zzibr.zzbM();

    static {
        zzavq zzavqVar = new zzavq();
        zzo = zzavqVar;
        zzibr.zzbu(zzavq.class, zzavqVar);
    }

    private zzavq() {
    }

    public static zzavm zza() {
        return (zzavm) zzo.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzc(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzavo.class, "zzn", zzavp.zza});
        }
        if (iOrdinal == 3) {
            return new zzavq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavm(bArr);
        }
        if (iOrdinal == 5) {
            return zzo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzp;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzavq.class) {
            try {
                zzibmVar = zzp;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzo);
                    zzp = zzibmVar;
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

    final /* synthetic */ void zzg(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    final /* synthetic */ void zzj(int i10) {
        this.zzn = i10 - 1;
        this.zza |= 2048;
    }
}
