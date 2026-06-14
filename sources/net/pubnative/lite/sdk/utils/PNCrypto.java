package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes3.dex */
public class PNCrypto {
    private static final String AES_MODE = "AES/CBC/PKCS5Padding";
    private static final String TAG = "PNCrypto";
    private static final byte[] ivBytes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static String decryptString(String str, String str2) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 0, 16);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrDecode, 16, bArrDecode.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(2, new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(bArrCopyOfRange));
            return new String(cipher.doFinal(bArrCopyOfRange2), charset);
        } catch (Exception e10) {
            HyBid.reportException(e10);
            e10.printStackTrace();
            return null;
        }
    }

    public static String encryptString(String str, String str2) {
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(1, new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(bArr));
            return Base64.encodeToString(getCombinedArray(bArr, cipher.doFinal(str.getBytes(charset))), 2);
        } catch (Exception e10) {
            HyBid.reportException(e10);
            e10.printStackTrace();
            return null;
        }
    }

    private static byte[] getCombinedArray(byte[] bArr, byte[] bArr2) {
        int length = bArr.length + bArr2.length;
        byte[] bArr3 = new byte[length];
        int i10 = 0;
        while (i10 < length) {
            bArr3[i10] = i10 < bArr.length ? bArr[i10] : bArr2[i10 - bArr.length];
            i10++;
        }
        return bArr3;
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(b10 & 255));
                while (sb3.length() < 2) {
                    sb3.insert(0, "0");
                }
                sb2.append((CharSequence) sb3);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            HyBid.reportException((Exception) e10);
            e10.printStackTrace();
            return "";
        }
    }

    public static String sha1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            for (byte b10 : messageDigest.digest()) {
                sb2.append(String.format("%02X", Byte.valueOf(b10)));
            }
            return sb2.toString().toLowerCase(Locale.US);
        } catch (Exception e10) {
            HyBid.reportException(e10);
            e10.printStackTrace();
            return "";
        }
    }
}
