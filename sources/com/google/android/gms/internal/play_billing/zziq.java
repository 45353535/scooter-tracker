package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zziq extends zzfu implements zzhc {
    private static final zziq zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zziq zziqVar = new zziq();
        zzb = zziqVar;
        zzfu.zzB(zziq.class, zziqVar);
    }

    private zziq() {
    }

    public static zzio zza() {
        return (zzio) zzb.zzp();
    }

    public static zziq zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zziq zziqVar, String str) {
        str.getClass();
        zziqVar.zzd = 3;
        zziqVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzhk(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", zzhx.class, zzgo.class});
        }
        if (i11 == 3) {
            return new zziq();
        }
        zzip zzipVar = null;
        if (i11 == 4) {
            return new zzio(zzipVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
