package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhve implements zzhbr {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhve(ECPrivateKey eCPrivateKey, zzhxn zzhxnVar, zzhwx zzhwxVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        zzhyb.zza(zzhxnVar);
    }

    public static zzhbr zzb(zzhsi zzhsiVar) throws GeneralSecurityException {
        Provider providerZza = zzhih.zza();
        return new zzhve((ECPrivateKey) (providerZza != null ? KeyFactory.getInstance("EC", providerZza) : (KeyFactory) zzhxe.zzf.zzb("EC")).generatePrivate(new ECPrivateKeySpec(zzhsiVar.zzf().zzb(zzhax.zza()), zzhwy.zzb((zzhww) zzhvf.zzc.zzb(zzhsiVar.zzd().zzd())))), (zzhxn) zzhvf.zza.zzb(zzhsiVar.zzd().zze()), (zzhwx) zzhvf.zzb.zzb(zzhsiVar.zzd().zzc()), zzhsiVar.zze().zze().zzc(), zzhsiVar.zzd().zzf().equals(zzhsf.zzc) ? zzb : zza, providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
