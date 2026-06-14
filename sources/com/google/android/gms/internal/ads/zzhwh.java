package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhwh implements zzhbr {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhwh(RSAPrivateCrtKey rSAPrivateCrtKey, zzhui zzhuiVar, zzhui zzhuiVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
        zzhwi.zzc(zzhuiVar);
        zzhwi.zzd(zzhuiVar, zzhuiVar2, i10);
    }

    public static zzhbr zzb(zzhum zzhumVar) throws GeneralSecurityException {
        Provider providerZzb = zzhwi.zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzb);
        zzhuk zzhukVarZzd = zzhumVar.zzd();
        return new zzhwh((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhumVar.zze().zzd(), zzhukVarZzd.zzd(), zzhumVar.zzi().zzb(zzhax.zza()), zzhumVar.zzf().zzb(zzhax.zza()), zzhumVar.zzh().zzb(zzhax.zza()), zzhumVar.zzj().zzb(zzhax.zza()), zzhumVar.zzk().zzb(zzhax.zza()), zzhumVar.zzl().zzb(zzhax.zza()))), zzhukVarZzd.zzf(), zzhukVarZzd.zzg(), zzhukVarZzd.zzh(), zzhumVar.zze().zze().zzc(), zzhukVarZzd.zze().equals(zzhuj.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
