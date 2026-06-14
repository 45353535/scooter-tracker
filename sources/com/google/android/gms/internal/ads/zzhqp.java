package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhqp extends zzibr implements zzidd {
    private static final zzhqp zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzicd zzb = zzibr.zzbM();

    static {
        zzhqp zzhqpVar = new zzhqp();
        zzc = zzhqpVar;
        zzibr.zzbu(zzhqp.class, zzhqpVar);
    }

    private zzhqp() {
    }

    public static zzhqm zza() {
        return (zzhqm) zzc.zzbn();
    }

    final /* synthetic */ void zzb(int i10) {
        this.zza = i10;
    }

    final /* synthetic */ void zzc(zzhqo zzhqoVar) {
        zzhqoVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzhqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhqo.class});
        }
        if (iOrdinal == 3) {
            return new zzhqp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqm(bArr);
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
        synchronized (zzhqp.class) {
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
}
