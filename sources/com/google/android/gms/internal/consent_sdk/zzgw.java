package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgw extends zzqm implements zzrr {
    private static final zzgw zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzgw zzgwVar = new zzgw();
        zzb = zzgwVar;
        zzqm.zzz(zzgw.class, zzgwVar);
    }

    private zzgw() {
    }

    public static zzgv zza() {
        return (zzgv) zzb.zzp();
    }

    static /* synthetic */ void zzd(zzgw zzgwVar, int i10) {
        zzgwVar.zzd |= 8;
        zzgwVar.zzh = i10;
    }

    static /* synthetic */ void zze(zzgw zzgwVar, String str) {
        str.getClass();
        zzgwVar.zzd |= 4;
        zzgwVar.zzg = str;
    }

    static /* synthetic */ void zzf(zzgw zzgwVar, String str) {
        str.getClass();
        zzgwVar.zzd |= 2;
        zzgwVar.zzf = str;
    }

    static /* synthetic */ void zzg(zzgw zzgwVar, int i10) {
        zzgwVar.zze = 1;
        zzgwVar.zzd = 1 | zzgwVar.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgw();
        }
        zzhb zzhbVar = null;
        if (i11 == 4) {
            return new zzgv(zzhbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
