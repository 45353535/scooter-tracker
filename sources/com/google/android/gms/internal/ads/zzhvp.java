package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhvp implements zzhbr {
    private zzhvp(zzhbr zzhbrVar, byte[] bArr, byte[] bArr2) {
    }

    public static zzhbr zzb(zzhjo zzhjoVar) throws GeneralSecurityException {
        zzhlb zzhlbVarZzc = zzhjoVar.zzc(zzhax.zza());
        return new zzhvp((zzhbr) zzhjc.zza().zzc(zzhlbVarZzc.zzg(), zzhbr.class).zza(zzhlbVarZzc.zzb()), zzhvq.zzc(zzhlbVarZzc), zzhvq.zzd(zzhlbVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
