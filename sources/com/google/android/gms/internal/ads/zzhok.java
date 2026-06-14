package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhok extends zzibr implements zzidd {
    private static final zzhok zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhok zzhokVar = new zzhok();
        zzb = zzhokVar;
        zzibr.zzbu(zzhok.class, zzhokVar);
    }

    private zzhok() {
    }

    public static zzhoj zzb() {
        return (zzhoj) zzb.zzbn();
    }

    public static zzhok zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhok();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhoj(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhok.class) {
            try {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
