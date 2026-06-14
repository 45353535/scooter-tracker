package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhfr extends zzhcg {
    private final zzhfx zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhfr(zzhfx zzhfxVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhfxVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhfr zzd(zzhfw zzhfwVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhfw zzhfwVar2 = zzhfw.zzc;
        if (zzhfwVar != zzhfwVar2 && num == null) {
            String string = zzhfwVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhfwVar == zzhfwVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int iZzd = zzhygVar.zzd();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 75);
            sb3.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb3.append(iZzd);
            throw new GeneralSecurityException(sb3.toString());
        }
        zzhfx zzhfxVarZzb = zzhfx.zzb(zzhfwVar);
        if (zzhfxVarZzb.zzc() == zzhfwVar2) {
            zzhyeVarZzb = zzhkh.zza;
        } else if (zzhfxVarZzb.zzc() == zzhfw.zzb) {
            zzhyeVarZzb = zzhkh.zza(num.intValue());
        } else {
            if (zzhfxVarZzb.zzc() != zzhfw.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhfxVarZzb.zzc().toString()));
            }
            zzhyeVarZzb = zzhkh.zzb(num.intValue());
        }
        return new zzhfr(zzhfxVarZzb, zzhygVar, zzhyeVarZzb, num);
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

    public final zzhfx zzf() {
        return this.zza;
    }
}
