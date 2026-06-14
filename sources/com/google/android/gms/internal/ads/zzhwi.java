package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhwi implements zzhbs {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final Provider zzh;

    private zzhwi(RSAPublicKey rSAPublicKey, zzhui zzhuiVar, zzhui zzhuiVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!zzhuiVar.equals(zzhuiVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
        zzhyc.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhuiVar);
        this.zze = zzd(zzhuiVar, zzhuiVar2, i10);
        this.zzf = bArr;
        this.zzg = bArr2;
        this.zzh = provider;
    }

    static Provider zzb() {
        if (!zzhln.zzc() || zzhln.zzd().intValue() > 23) {
            return zzhih.zza();
        }
        return null;
    }

    static String zzc(zzhui zzhuiVar) {
        if (zzhuiVar == zzhui.zza) {
            return "SHA256withRSA/PSS";
        }
        if (zzhuiVar == zzhui.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzhuiVar == zzhui.zzc) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(zzhuiVar)));
    }

    static PSSParameterSpec zzd(zzhui zzhuiVar, zzhui zzhuiVar2, int i10) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhui zzhuiVar3 = zzhui.zza;
        if (zzhuiVar == zzhuiVar3) {
            str = "SHA-256";
        } else if (zzhuiVar == zzhui.zzb) {
            str = "SHA-384";
        } else {
            if (zzhuiVar != zzhui.zzc) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(zzhuiVar)));
            }
            str = "SHA-512";
        }
        if (zzhuiVar2 == zzhuiVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhuiVar2 == zzhui.zzb) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhuiVar2 != zzhui.zzc) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(zzhuiVar2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i10, 1);
    }

    public static zzhbs zze(zzhuo zzhuoVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerZzb).generatePublic(new RSAPublicKeySpec(zzhuoVar.zzd(), zzhuoVar.zzf().zzd()));
        zzhuk zzhukVarZzf = zzhuoVar.zzf();
        return new zzhwi(rSAPublicKey, zzhukVarZzf.zzf(), zzhukVarZzf.zzg(), zzhukVarZzf.zzh(), zzhuoVar.zze().zzc(), zzhuoVar.zzf().zze().equals(zzhuj.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzh;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
