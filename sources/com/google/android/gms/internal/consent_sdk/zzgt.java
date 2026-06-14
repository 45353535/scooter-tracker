package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgt extends zzqm implements zzrr {
    private static final zzgt zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzgt zzgtVar = new zzgt();
        zzb = zzgtVar;
        zzqm.zzz(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public static zzgs zza() {
        return (zzgs) zzb.zzp();
    }

    static /* synthetic */ void zzd(zzgt zzgtVar, String str) {
        str.getClass();
        zzgtVar.zzd |= 1;
        zzgtVar.zze = str;
    }

    static /* synthetic */ void zze(zzgt zzgtVar, String str) {
        str.getClass();
        zzgtVar.zzd |= 2;
        zzgtVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgt();
        }
        zzhb zzhbVar = null;
        if (i11 == 4) {
            return new zzgs(zzhbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
