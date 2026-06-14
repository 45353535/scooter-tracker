package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhnt implements zzhnp {
    private static final ThreadLocal zzd = new zzhns();
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhnt(byte[] bArr) throws GeneralSecurityException {
        zzhyc.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher cipherZzc = zzc();
        cipherZzc.init(1, secretKeySpec);
        byte[] bArrZza = zzhnd.zza(cipherZzc.doFinal(new byte[16]));
        this.zzb = bArrZza;
        this.zzc = zzhnd.zza(bArrZza);
    }

    public static zzhnp zzb(zzhnn zzhnnVar) throws GeneralSecurityException {
        return new zzhnt(zzhnnVar.zzd().zzc(zzhax.zza()));
    }

    private static Cipher zzc() throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            return (Cipher) zzd.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzd(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArrZzb;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zza;
        Cipher cipherZzc = zzc();
        cipherZzc.init(1, secretKey);
        int length = bArr.length;
        int i11 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i12 = i11 - 1;
        int i13 = i12 * 16;
        if (i11 * 16 == length) {
            bArrZzb = zzhwr.zzb(bArr, i13, this.zzb, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = UnsignedBytes.MAX_POWER_OF_TWO;
            byte[] bArr2 = this.zzc;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrZzb = zzhwr.zzb(bArrCopyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i14 = 0; i14 < i12; i14++) {
            zzd(bArr3, bArr, i14 * 16, bArr4);
            if (cipherZzc.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zzd(bArr3, bArrZzb, 0, bArr4);
        if (cipherZzc.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i10 == 16 ? bArr3 : Arrays.copyOf(bArr3, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
