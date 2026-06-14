package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhfl extends zzhcg {
    private final zzhfq zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhfl(zzhfq zzhfqVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhfqVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhfl zzd(zzhfq zzhfqVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhfp zzhfpVarZzc = zzhfqVar.zzc();
        zzhfp zzhfpVar = zzhfp.zzb;
        if (zzhfpVarZzc != zzhfpVar && num == null) {
            String string = zzhfqVar.zzc().toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhfqVar.zzc() == zzhfpVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int iZzd = zzhygVar.zzd();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 68);
            sb3.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb3.append(iZzd);
            throw new GeneralSecurityException(sb3.toString());
        }
        if (zzhfqVar.zzc() == zzhfpVar) {
            zzhyeVarZzb = zzhkh.zza;
        } else {
            if (zzhfqVar.zzc() != zzhfp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhfqVar.zzc().toString()));
            }
            zzhyeVarZzb = zzhkh.zzb(num.intValue());
        }
        return new zzhfl(zzhfqVar, zzhygVar, zzhyeVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzc;
    }

    public final zzhyg zze() {
        return this.zzb;
    }

    public final zzhfq zzf() {
        return this.zza;
    }
}
