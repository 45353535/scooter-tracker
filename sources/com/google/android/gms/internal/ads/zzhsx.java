package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhsx extends zzhuw {
    private final zzhsq zza;
    private final zzhye zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhsx(zzhsq zzhsqVar, zzhye zzhyeVar, zzhye zzhyeVar2, Integer num) {
        this.zza = zzhsqVar;
        this.zzb = zzhyeVar;
        this.zzc = zzhyeVar2;
        this.zzd = num;
    }

    public static zzhsx zzc(zzhsp zzhspVar, zzhye zzhyeVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZza;
        zzhsq zzhsqVarZzb = zzhsq.zzb(zzhspVar);
        zzhsp zzhspVar2 = zzhsp.zzd;
        if (!zzhspVar.equals(zzhspVar2) && num == null) {
            String string = zzhspVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhspVar.equals(zzhspVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhyeVar.zzd() != 32) {
            int iZzd = zzhyeVar.zzd();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 65);
            sb3.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb3.append(iZzd);
            throw new GeneralSecurityException(sb3.toString());
        }
        if (zzhsqVarZzb.zzc() == zzhspVar2) {
            zzhyeVarZza = zzhkh.zza;
        } else if (zzhsqVarZzb.zzc() == zzhsp.zzb || zzhsqVarZzb.zzc() == zzhsp.zzc) {
            zzhyeVarZza = zzhkh.zza(num.intValue());
        } else {
            if (zzhsqVarZzb.zzc() != zzhsp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhsqVarZzb.zzc().toString()));
            }
            zzhyeVarZza = zzhkh.zzb(num.intValue());
        }
        return new zzhsx(zzhsqVarZzb, zzhyeVar, zzhyeVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhye zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final zzhye zze() {
        return this.zzc;
    }

    public final zzhsq zzf() {
        return this.zza;
    }
}
