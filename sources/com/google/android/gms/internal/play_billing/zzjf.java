package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjf extends zzfu implements zzhc {
    private static final zzjf zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzfu.zzB(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    static /* synthetic */ void zzG(zzjf zzjfVar, int i10) {
        zzjfVar.zzd |= 1;
        zzjfVar.zze = i10;
    }

    public static zzjb zza() {
        return (zzjb) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzjf zzjfVar, String str) {
        zzjfVar.zzd |= 8;
        zzjfVar.zzh = str;
    }

    static /* synthetic */ void zze(zzjf zzjfVar, String str) {
        str.getClass();
        zzjfVar.zzd |= 2;
        zzjfVar.zzf = str;
    }

    static /* synthetic */ void zzf(zzjf zzjfVar, int i10) {
        zzjfVar.zzd |= 32;
        zzjfVar.zzj = 0;
    }

    static /* synthetic */ void zzg(zzjf zzjfVar, int i10) {
        zzjfVar.zzd |= 16;
        zzjfVar.zzi = i10;
    }

    static /* synthetic */ void zzh(zzjf zzjfVar, zzjd zzjdVar) {
        zzjfVar.zzg = zzjdVar.zza();
        zzjfVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", zzjc.zza, "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzjf();
        }
        zzje zzjeVar = null;
        if (i11 == 4) {
            return new zzjb(zzjeVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
