package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxx extends zzibr implements zzidd {
    private static final zzaxx zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzicd zzb = zzibr.zzbM();
    private zzian zzc = zzian.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzaxx zzaxxVar = new zzaxx();
        zzf = zzaxxVar;
        zzibr.zzbu(zzaxx.class, zzaxxVar);
    }

    private zzaxx() {
    }

    public static zzaxw zza() {
        return (zzaxw) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzian zzianVar) {
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzianVar);
    }

    final /* synthetic */ void zzc(zzian zzianVar) {
        this.zza |= 1;
        this.zzc = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxr.zza, "zze", zzaxn.zza});
        }
        if (iOrdinal == 3) {
            return new zzaxx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxw(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzaxx.class) {
            try {
                zzibmVar = zzg;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzf);
                    zzg = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zze(int i10) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i10) {
        this.zze = i10 - 1;
        this.zza |= 4;
    }
}
