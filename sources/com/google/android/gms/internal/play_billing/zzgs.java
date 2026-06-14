package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
final class zzgs implements zzhm {
    private static final zzgz zza = new zzgq();
    private final zzgz zzb;

    public zzgs() {
        zzfp zzfpVarZza = zzfp.zza();
        int i10 = zzei.zza;
        zzgr zzgrVar = new zzgr(zzfpVarZza, zza);
        byte[] bArr = zzga.zzb;
        this.zzb = zzgrVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final zzhl zza(Class cls) {
        int i10 = zzhn.zza;
        if (!zzfu.class.isAssignableFrom(cls)) {
            int i11 = zzei.zza;
        }
        zzgy zzgyVarZzb = this.zzb.zzb(cls);
        if (zzgyVarZzb.zzb()) {
            int i12 = zzei.zza;
            return zzhf.zzc(zzhn.zzn(), zzfk.zza(), zzgyVarZzb.zza());
        }
        int i13 = zzei.zza;
        return zzhe.zzl(cls, zzgyVarZzb, zzhh.zza(), zzgl.zza(), zzhn.zzn(), zzgyVarZzb.zzc() + (-1) != 1 ? zzfk.zza() : null, zzgx.zza());
    }
}
