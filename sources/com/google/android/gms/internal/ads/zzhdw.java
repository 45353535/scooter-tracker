package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhdw extends zzhcg {
    private final zzheb zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhdw(zzheb zzhebVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhebVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhdw zzd(zzhea zzheaVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhea zzheaVar2 = zzhea.zzc;
        if (zzheaVar != zzheaVar2 && num == null) {
            String string = zzheaVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzheaVar == zzheaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int iZzd = zzhygVar.zzd();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 74);
            sb3.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb3.append(iZzd);
            throw new GeneralSecurityException(sb3.toString());
        }
        zzheb zzhebVarZzb = zzheb.zzb(zzheaVar);
        if (zzhebVarZzb.zzc() == zzheaVar2) {
            zzhyeVarZzb = zzhkh.zza;
        } else if (zzhebVarZzb.zzc() == zzhea.zzb) {
            zzhyeVarZzb = zzhkh.zza(num.intValue());
        } else {
            if (zzhebVarZzb.zzc() != zzhea.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhebVarZzb.zzc().toString()));
            }
            zzhyeVarZzb = zzhkh.zzb(num.intValue());
        }
        return new zzhdw(zzhebVarZzb, zzhygVar, zzhyeVarZzb, num);
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

    public final zzheb zzf() {
        return this.zza;
    }
}
