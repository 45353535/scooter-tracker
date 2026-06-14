package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfy extends zzqm implements zzrr {
    private static final zzfy zzb;

    static {
        zzfy zzfyVar = new zzfy();
        zzb = zzfyVar;
        zzqm.zzz(zzfy.class, zzfyVar);
    }

    private zzfy() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzfx zzfxVar = null;
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzfy();
        }
        if (i11 == 4) {
            return new zzfw(zzfxVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
