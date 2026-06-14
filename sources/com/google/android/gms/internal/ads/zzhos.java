package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhos extends zzibr implements zzidd {
    private static final zzhos zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzian zzb = zzian.zza;

    static {
        zzhos zzhosVar = new zzhos();
        zzc = zzhosVar;
        zzibr.zzbu(zzhos.class, zzhosVar);
    }

    private zzhos() {
    }

    public static zzhos zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhos) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhor zzd() {
        return (zzhor) zzc.zzbn();
    }

    public static zzidk zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhos();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhor(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhos.class) {
            try {
                zzibmVar = zzd;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzc);
                    zzd = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zzg(zzian zzianVar) {
        this.zzb = zzianVar;
    }
}
