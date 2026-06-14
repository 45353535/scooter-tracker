package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhsr extends zzhuv {
    private final zzhsx zza;
    private final zzhyg zzb;

    private zzhsr(zzhsx zzhsxVar, zzhyg zzhygVar) {
        this.zza = zzhsxVar;
        this.zzb = zzhygVar;
    }

    public static zzhsr zzc(zzhsx zzhsxVar, zzhyg zzhygVar) throws GeneralSecurityException {
        if (zzhygVar.zzd() == 32) {
            if (Arrays.equals(zzhsxVar.zzd().zzc(), zzhio.zza(zzhio.zzb(zzhygVar.zzc(zzhax.zza()))))) {
                return new zzhsr(zzhsxVar, zzhygVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        int iZzd = zzhygVar.zzd();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 65);
        sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb2.append(iZzd);
        throw new GeneralSecurityException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhuv, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza.zzf();
    }

    public final zzhsq zzd() {
        return this.zza.zzf();
    }

    public final zzhsx zze() {
        return this.zza;
    }

    public final zzhyg zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuv
    public final /* synthetic */ zzhuw zzg() {
        return this.zza;
    }
}
