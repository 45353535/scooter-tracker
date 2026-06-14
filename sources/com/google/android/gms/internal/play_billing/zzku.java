package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzku extends zzfu implements zzhc {
    private static final zzku zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        zzku zzkuVar = new zzku();
        zzb = zzkuVar;
        zzfu.zzB(zzku.class, zzkuVar);
    }

    private zzku() {
    }

    public static zzks zza() {
        return (zzks) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzku zzkuVar, boolean z10) {
        zzkuVar.zzd |= 8;
        zzkuVar.zzh = z10;
    }

    static /* synthetic */ void zze(zzku zzkuVar, int i10) {
        zzkuVar.zzd |= 16;
        zzkuVar.zzi = i10;
    }

    static /* synthetic */ void zzf(zzku zzkuVar, long j10) {
        zzkuVar.zzd |= 4;
        zzkuVar.zzg = j10;
    }

    static /* synthetic */ void zzg(zzku zzkuVar, int i10) {
        zzkuVar.zzd |= 32;
        zzkuVar.zzj = 0;
    }

    static /* synthetic */ void zzh(zzku zzkuVar, boolean z10) {
        zzkuVar.zzd |= 2;
        zzkuVar.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzku();
        }
        zzkt zzktVar = null;
        if (i11 == 4) {
            return new zzks(zzktVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
