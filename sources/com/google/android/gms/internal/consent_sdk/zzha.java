package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzha extends zzqm implements zzrr {
    private static final zzha zzb;
    private int zzd;
    private String zze = "";

    static {
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzqm.zzz(zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public static zzgz zza() {
        return (zzgz) zzb.zzp();
    }

    static /* synthetic */ void zzd(zzha zzhaVar, String str) {
        zzhaVar.zzd |= 1;
        zzhaVar.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzha();
        }
        zzhb zzhbVar = null;
        if (i11 == 4) {
            return new zzgz(zzhbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
