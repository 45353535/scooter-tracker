package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlh extends zzqm implements zzrr {
    private static final zzlh zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";
    private String zzh = "";

    static {
        zzlh zzlhVar = new zzlh();
        zzb = zzlhVar;
        zzqm.zzz(zzlh.class, zzlhVar);
    }

    private zzlh() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004;\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzlh();
        }
        zzli zzliVar = null;
        if (i11 == 4) {
            return new zzlg(zzliVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
