package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfpc extends zzibr implements zzidd {
    private static final zzfpc zzi;
    private static volatile zzidk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfpc zzfpcVar = new zzfpc();
        zzi = zzfpcVar;
        zzibr.zzbu(zzfpc.class, zzfpcVar);
    }

    private zzfpc() {
    }

    public static zzfpb zza() {
        return (zzfpb) zzi.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void zzd(long j10) {
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
            return zzibr.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzfpc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpb(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzj;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzfpc.class) {
            try {
                zzibmVar = zzj;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzi);
                    zzj = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zze(boolean z10) {
        this.zzd = z10;
    }

    final /* synthetic */ void zzg(long j10) {
        this.zze = j10;
    }

    final /* synthetic */ void zzh(long j10) {
        this.zzf = j10;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    final /* synthetic */ void zzk(int i10) {
        this.zzh = i10 - 2;
    }
}
