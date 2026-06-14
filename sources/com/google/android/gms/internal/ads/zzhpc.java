package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhpc extends zzibr implements zzidd {
    private static final zzhpc zza;
    private static volatile zzidk zzb;

    static {
        zzhpc zzhpcVar = new zzhpc();
        zza = zzhpcVar;
        zzibr.zzbu(zzhpc.class, zzhpcVar);
    }

    private zzhpc() {
    }

    public static zzhpc zza(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpc) zzibr.zzbT(zza, zzianVar, zzibbVar);
    }

    public static zzhpc zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return zzibr.zzbv(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhpc();
        }
        if (iOrdinal == 4) {
            return new zzhpb(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzb;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhpc.class) {
            try {
                zzibmVar = zzb;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zza);
                    zzb = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }
}
