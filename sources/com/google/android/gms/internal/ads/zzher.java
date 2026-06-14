package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzher extends zzhcg {
    private final zzhev zza;
    private final zzhye zzb;
    private final Integer zzc;

    private zzher(zzhev zzhevVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhevVar;
        this.zzb = zzhyeVar;
        this.zzc = num;
    }

    public static zzher zzd(zzhev zzhevVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        if (zzhevVar.zzc() == zzheu.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzhyeVarZzb = zzhkh.zza;
        } else {
            if (zzhevVar.zzc() != zzheu.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzhevVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzhyeVarZzb = zzhkh.zzb(num.intValue());
        }
        return new zzher(zzhevVar, zzhyeVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzb;
    }

    public final zzhev zze() {
        return this.zza;
    }
}
