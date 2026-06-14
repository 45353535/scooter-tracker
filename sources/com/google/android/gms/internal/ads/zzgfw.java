package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgfw {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    private static final Cipher zzc() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (zzc) {
            try {
                if (zza == null) {
                    zza = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                }
                cipher = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, String str) throws zzgfv {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZzb = zzgca.zzb(str, false);
            int length2 = bArrZzb.length;
            if (length2 <= 16) {
                throw new zzgfv();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZzb);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = zzc().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new zzgfv(e);
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            throw new zzgfv(e);
        } catch (InvalidKeyException e12) {
            e = e12;
            throw new zzgfv(e);
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new zzgfv(e);
        } catch (BadPaddingException e14) {
            e = e14;
            throw new zzgfv(e);
        } catch (IllegalBlockSizeException e15) {
            e = e15;
            throw new zzgfv(e);
        } catch (NoSuchPaddingException e16) {
            e = e16;
            throw new zzgfv(e);
        }
    }

    public final String zzb(byte[] bArr, String str) throws zzgfv, UnsupportedEncodingException {
        return new String(zza(bArr, str), "UTF-8");
    }
}
