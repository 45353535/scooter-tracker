package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzheg implements zzhkt {
    static final /* synthetic */ zzheg zza = new zzheg();

    private /* synthetic */ zzheg() {
    }

    @Override // com.google.android.gms.internal.ads.zzhkt
    public final /* synthetic */ Object zza(zzhaz zzhazVar) throws GeneralSecurityException {
        zzher zzherVar = (zzher) zzhazVar;
        int i10 = zzhei.zza;
        String strZzb = zzherVar.zze().zzb();
        zzhch zzhchVarZzd = zzherVar.zze().zzd();
        zzhas zzhasVarZzb = zzhbn.zza(strZzb).zzb();
        int i11 = zzhef.zza;
        try {
            return zzhhj.zzc(new zzhef(zzhqf.zzd(zzhbv.zza(zzhchVarZzd), zzibb.zza()), zzhasVarZzb), zzherVar.zzc());
        } catch (zzicg e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
