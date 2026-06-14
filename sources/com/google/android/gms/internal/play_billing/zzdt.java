package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdt extends zzfu implements zzhc {
    private static final zzdt zzb;
    private zzfz zzd = zzfu.zzv();

    static {
        zzdt zzdtVar = new zzdt();
        zzb = zzdtVar;
        zzfu.zzB(zzdt.class, zzdtVar);
    }

    private zzdt() {
    }

    public static zzds zza() {
        return (zzds) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzdt zzdtVar, Iterable iterable) {
        zzfz zzfzVar = zzdtVar.zzd;
        if (!zzfzVar.zzc()) {
            int size = zzfzVar.size();
            zzdtVar.zzd = zzfzVar.zzd(size + size);
        }
        zzeg.zzk(iterable, zzdtVar.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzdr.class});
        }
        if (i11 == 3) {
            return new zzdt();
        }
        zzdu zzduVar = null;
        if (i11 == 4) {
            return new zzds(zzduVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
