package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeb extends zzfu implements zzhc {
    private static final zzeb zzb;
    private int zzd;
    private String zze = "";

    static {
        zzeb zzebVar = new zzeb();
        zzb = zzebVar;
        zzfu.zzB(zzeb.class, zzebVar);
    }

    private zzeb() {
    }

    public static zzea zza() {
        return (zzea) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzeb zzebVar, String str) {
        zzebVar.zzd |= 1;
        zzebVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzeb();
        }
        zzec zzecVar = null;
        if (i11 == 4) {
            return new zzea(zzecVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
