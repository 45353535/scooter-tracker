package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfwa extends zzibr implements zzidd {
    private static final zzfwa zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzibz zzb = zzibr.zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfwa zzfwaVar = new zzfwa();
        zzf = zzfwaVar;
        zzibr.zzbu(zzfwa.class, zzfwaVar);
    }

    private zzfwa() {
    }

    public static zzfvz zza() {
        return (zzfvz) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(int i10) {
        zzibz zzibzVar = this.zzb;
        if (!zzibzVar.zza()) {
            this.zzb = zzibr.zzbD(zzibzVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfvy.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfwa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfvz(bArr);
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
        synchronized (zzfwa.class) {
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
}
