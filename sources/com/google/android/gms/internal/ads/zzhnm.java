package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhnm implements zzhbo {
    private zzhnm(zzhbo zzhboVar, zzhqy zzhqyVar, byte[] bArr) {
    }

    public static zzhbo zza(zzhjo zzhjoVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhlb zzhlbVarZzc = zzhjoVar.zzc(zzhax.zza());
        zzhbo zzhboVar = (zzhbo) zzhjc.zza().zzc(zzhlbVarZzc.zzg(), zzhbo.class).zza(zzhlbVarZzc.zzb());
        zzhqy zzhqyVarZzd = zzhlbVarZzc.zzd();
        int iOrdinal = zzhqyVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhkh.zzb(zzhjoVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhkh.zza.zzc();
        }
        return new zzhnm(zzhboVar, zzhqyVarZzd, bArrZzc);
    }
}
