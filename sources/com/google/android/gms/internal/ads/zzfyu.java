package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfyu extends zzibr implements zzidd {
    private static final zzfyu zzn;
    private static volatile zzidk zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzicc zzk = zzibr.zzbE();
    private zzicc zzl = zzibr.zzbE();
    private zzicc zzm = zzibr.zzbE();

    static {
        zzfyu zzfyuVar = new zzfyu();
        zzn = zzfyuVar;
        zzibr.zzbu(zzfyu.class, zzfyuVar);
    }

    private zzfyu() {
    }

    public static zzfyu zzp() {
        return zzn;
    }

    final /* synthetic */ void zzA(long j10) {
        zzicc zziccVar = this.zzl;
        if (!zziccVar.zza()) {
            this.zzl = zzibr.zzbF(zziccVar);
        }
        this.zzl.zzd(j10);
    }

    final /* synthetic */ void zzB(long j10) {
        zzicc zziccVar = this.zzm;
        if (!zziccVar.zza()) {
            this.zzm = zzibr.zzbF(zziccVar);
        }
        this.zzm.zzd(j10);
    }

    final /* synthetic */ void zzC() {
        this.zzm = zzibr.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
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
            return zzibr.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzfyu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfyt(bArr);
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
        synchronized (zzfyu.class) {
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

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzr(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    final /* synthetic */ void zzs(int i10) {
        this.zza |= 2;
        this.zzd = i10;
    }

    final /* synthetic */ void zzt(boolean z10) {
        this.zza |= 4;
        this.zze = true;
    }

    final /* synthetic */ void zzu(boolean z10) {
        this.zza |= 8;
        this.zzf = true;
    }

    final /* synthetic */ void zzv(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    final /* synthetic */ void zzw(long j10) {
        this.zzh = j10;
    }

    final /* synthetic */ void zzx(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    final /* synthetic */ void zzy(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    final /* synthetic */ void zzz(long j10) {
        zzicc zziccVar = this.zzk;
        if (!zziccVar.zza()) {
            this.zzk = zzibr.zzbF(zziccVar);
        }
        this.zzk.zzd(j10);
    }
}
