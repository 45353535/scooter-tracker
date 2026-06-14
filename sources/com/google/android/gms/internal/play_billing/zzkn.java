package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkn extends zzfu implements zzhc {
    private static final zzkn zzb;
    private int zzd;
    private zzjf zze;
    private long zzf;

    static {
        zzkn zzknVar = new zzkn();
        zzb = zzknVar;
        zzfu.zzB(zzkn.class, zzknVar);
    }

    private zzkn() {
    }

    public static zzkl zza() {
        return (zzkl) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzkn zzknVar, zzjf zzjfVar) {
        zzjfVar.getClass();
        zzknVar.zze = zzjfVar;
        zzknVar.zzd |= 1;
    }

    static /* synthetic */ void zze(zzkn zzknVar, long j10) {
        zzknVar.zzd |= 2;
        zzknVar.zzf = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzkn();
        }
        zzkm zzkmVar = null;
        if (i11 == 4) {
            return new zzkl(zzkmVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
