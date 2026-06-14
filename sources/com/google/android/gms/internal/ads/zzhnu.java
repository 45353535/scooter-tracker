package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhnu implements zzhnp {
    private final Key zza;
    private final Provider zzb;

    private zzhnu(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.zza = new SecretKeySpec(bArr, "AES");
        this.zzb = provider;
    }

    public static zzhnp zzb(zzhnn zzhnnVar) throws GeneralSecurityException {
        Provider providerZza = zzhih.zza();
        if (providerZza == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerZza);
        return new zzhnu(zzhnnVar.zzd().zzc(zzhax.zza()), providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = this.zzb;
        Key key = this.zza;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i10 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i10);
    }
}
