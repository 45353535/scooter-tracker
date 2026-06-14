package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhrc extends zzibr implements zzidd {
    private static final zzhrc zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhre zzb;
    private int zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhrc zzhrcVar = new zzhrc();
        zze = zzhrcVar;
        zzibr.zzbu(zzhrc.class, zzhrcVar);
    }

    private zzhrc() {
    }

    public static zzhrc zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrc) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrb zze() {
        return (zzhrb) zze.zzbn();
    }

    public final zzhre zza() {
        zzhre zzhreVar = this.zzb;
        return zzhreVar == null ? zzhre.zzc() : zzhreVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhrc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrb(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzf;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhrc.class) {
            try {
                zzibmVar = zzf;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zze);
                    zzf = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zzg(zzhre zzhreVar) {
        zzhreVar.getClass();
        this.zzb = zzhreVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i10) {
        this.zzc = i10;
    }

    final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
