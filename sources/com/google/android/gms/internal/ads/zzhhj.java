package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhhj implements zzhas {
    private final zzhas zza;
    private final byte[] zzb;

    private zzhhj(zzhas zzhasVar, byte[] bArr) {
        this.zza = zzhasVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzhas zzb(zzhjo zzhjoVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhlb zzhlbVarZzc = zzhjoVar.zzc(zzhax.zza());
        zzhas zzhasVar = (zzhas) zzhjc.zza().zzc(zzhlbVarZzc.zzg(), zzhas.class).zza(zzhlbVarZzc.zzb());
        zzhqy zzhqyVarZzd = zzhlbVarZzc.zzd();
        int iOrdinal = zzhqyVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhkh.zzb(zzhjoVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhqyVarZzd)));
            }
            bArrZzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhkh.zza.zzc();
        }
        return new zzhhj(zzhasVar, bArrZzc);
    }

    public static zzhas zzc(zzhas zzhasVar, zzhye zzhyeVar) {
        return new zzhhj(zzhasVar, zzhyeVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhln.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
