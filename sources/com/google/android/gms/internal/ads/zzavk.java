package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavk extends zzibr implements zzidd {
    private static final zzavk zzn;
    private static volatile zzidk zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private zzicd zzb = zzibr.zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzavk zzavkVar = new zzavk();
        zzn = zzavkVar;
        zzibr.zzbu(zzavk.class, zzavkVar);
    }

    private zzavk() {
    }

    public static zzavj zza() {
        return (zzavj) zzn.zzbn();
    }

    final /* synthetic */ void zzb(zzawc zzawcVar) {
        zzawcVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzawcVar);
    }

    final /* synthetic */ void zzc() {
        this.zzb = zzibr.zzbM();
    }

    final /* synthetic */ void zzd(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", zzawc.class, "zzc", "zzd", "zze", "zzf", "zzg", zzawa.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzavk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzavj(bArr);
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
        synchronized (zzavk.class) {
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

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(long j10) {
        this.zza |= 64;
        this.zzi = j10;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    final /* synthetic */ void zzm(long j10) {
        this.zza |= 512;
        this.zzl = j10;
    }

    final /* synthetic */ void zzn(long j10) {
        this.zza |= 1024;
        this.zzm = j10;
    }

    final /* synthetic */ void zzp(int i10) {
        this.zzg = i10 - 1;
        this.zza |= 16;
    }
}
