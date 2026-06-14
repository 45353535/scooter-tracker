package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhny extends zzibr implements zzidd {
    private static final zzhny zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhoa zzc;

    static {
        zzhny zzhnyVar = new zzhny();
        zzd = zzhnyVar;
        zzibr.zzbu(zzhny.class, zzhnyVar);
    }

    private zzhny() {
    }

    public static zzhny zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhny) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhnx zzd() {
        return (zzhnx) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhoa zzb() {
        zzhoa zzhoaVar = this.zzc;
        return zzhoaVar == null ? zzhoa.zzc() : zzhoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhny();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnx(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zze;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhny.class) {
            try {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zze(int i10) {
        this.zzb = i10;
    }

    final /* synthetic */ void zzg(zzhoa zzhoaVar) {
        zzhoaVar.getClass();
        this.zzc = zzhoaVar;
        this.zza |= 1;
    }
}
