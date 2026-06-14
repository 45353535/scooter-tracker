package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhvo implements zzhbs {
    private static final byte[] zza = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private final PublicKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final Provider zze;

    private zzhvo(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.zzb = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(zzhwr.zza(zza, bArr)));
        this.zzc = bArr2;
        this.zzd = bArr3;
        this.zze = provider;
    }

    public static zzhbs zzb(zzhsx zzhsxVar) throws GeneralSecurityException {
        Provider providerZza = zzhih.zza();
        if (providerZza == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (zzhid.zza(1)) {
            return new zzhvo(zzhsxVar.zzd().zzc(), zzhsxVar.zze().zzc(), zzhsxVar.zzf().zzc().equals(zzhsp.zzc) ? new byte[]{0} : new byte[0], providerZza);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new GeneralSecurityException(String.format("Invalid signature length: %s", 64));
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Provider provider = this.zze;
        PublicKey publicKey = this.zzb;
        Signature signature = Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.zzd);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
