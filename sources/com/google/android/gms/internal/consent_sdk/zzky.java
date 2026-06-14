package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzky extends zzqm implements zzrr {
    private static final zzky zzb;
    private int zzd;
    private boolean zze;

    static {
        zzky zzkyVar = new zzky();
        zzb = zzkyVar;
        zzqm.zzz(zzky.class, zzkyVar);
    }

    private zzky() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzky();
        }
        zzkz zzkzVar = null;
        if (i11 == 4) {
            return new zzkx(zzkzVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
