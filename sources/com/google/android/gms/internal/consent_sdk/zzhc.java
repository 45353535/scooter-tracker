package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhc extends zzqm implements zzrr {
    private static final zzhc zzb;
    private int zzd;
    private zzgy zze;
    private zzha zzg;
    private zzgw zzh;
    private zzgt zzi;
    private String zzf = "";
    private zzqr zzj = zzqm.zzt();

    static {
        zzhc zzhcVar = new zzhc();
        zzb = zzhcVar;
        zzqm.zzz(zzhc.class, zzhcVar);
    }

    private zzhc() {
    }

    public static zzgu zza() {
        return (zzgu) zzb.zzp();
    }

    static /* synthetic */ void zzd(zzhc zzhcVar, String str) {
        str.getClass();
        zzqr zzqrVar = zzhcVar.zzj;
        if (!zzqrVar.zzc()) {
            int size = zzqrVar.size();
            zzhcVar.zzj = zzqrVar.zzd(size + size);
        }
        zzhcVar.zzj.add(str);
    }

    static /* synthetic */ void zze(zzhc zzhcVar, String str) {
        zzhcVar.zzd |= 2;
        zzhcVar.zzf = str;
    }

    static /* synthetic */ void zzf(zzhc zzhcVar, zzgt zzgtVar) {
        zzhcVar.zzi = zzgtVar;
        zzhcVar.zzd |= 16;
    }

    static /* synthetic */ void zzg(zzhc zzhcVar, zzgw zzgwVar) {
        zzgwVar.getClass();
        zzhcVar.zzh = zzgwVar;
        zzhcVar.zzd |= 8;
    }

    static /* synthetic */ void zzh(zzhc zzhcVar, zzgy zzgyVar) {
        zzgyVar.getClass();
        zzhcVar.zze = zzgyVar;
        zzhcVar.zzd |= 1;
    }

    static /* synthetic */ void zzi(zzhc zzhcVar, zzha zzhaVar) {
        zzhaVar.getClass();
        zzhcVar.zzg = zzhaVar;
        zzhcVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzhc();
        }
        zzhb zzhbVar = null;
        if (i11 == 4) {
            return new zzgu(zzhbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
