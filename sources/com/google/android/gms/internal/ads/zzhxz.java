package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzhxz implements zzhbs {
    private final RSAPublicKey zza;
    private final zzhxn zzb;
    private final zzhxn zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    /* synthetic */ zzhxz(RSAPublicKey rSAPublicKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhie.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhyc.zzb(zzhxnVar);
        if (!zzhxnVar.equals(zzhxnVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
        zzhyc.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhxnVar;
        this.zzc = zzhxnVar2;
        this.zzd = i10;
        this.zze = bArr;
        this.zzf = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhig.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        zzhxn zzhxnVar = this.zzb;
        zzhyc.zzb(zzhxnVar);
        zzhxe zzhxeVar = zzhxe.zzd;
        MessageDigest messageDigest = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(zzhxnVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrZzb.length;
        int i10 = this.zzd;
        if (length < digestLength + i10 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrZzb[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i11 = length - digestLength;
        int i12 = i11 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrZzb, i12);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrZzb, length2, length2 + digestLength);
        int i13 = 0;
        while (true) {
            long j10 = (((long) length) * 8) - ((long) iBitLength3);
            if (i13 < j10) {
                if (((bArrCopyOf[i13 / 8] >> (7 - (i13 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i13++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(this.zzc));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i12];
                int i14 = 0;
                int i15 = 0;
                while (i14 <= (i11 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i16 = i10;
                    messageDigest2.update(zzhig.zzb(BigInteger.valueOf(i14), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i15, Math.min(length3, i12 - i15));
                    i15 += length3;
                    i14++;
                    i10 = i16;
                    messageDigest2 = messageDigest2;
                }
                int i17 = i10;
                byte[] bArr5 = new byte[i12];
                for (int i18 = 0; i18 < i12; i18++) {
                    bArr5[i18] = (byte) (bArr4[i18] ^ bArrCopyOf[i18]);
                }
                for (int i19 = 0; i19 <= j10; i19++) {
                    int i20 = i19 / 8;
                    bArr5[i20] = (byte) ((~(1 << (7 - (i19 % 8)))) & bArr5[i20]);
                }
                int i21 = 0;
                while (true) {
                    int i22 = (i11 - i17) - 2;
                    if (i21 >= i22) {
                        if (bArr5[i22] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i12 - i17, i12);
                        int i23 = digestLength + 8;
                        byte[] bArr6 = new byte[i23 + i17];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i23, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i21] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i21++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
