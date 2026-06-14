package sg.bigo.ads.common.utils;

import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f102819a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f102820b = {1, 2, 3, 4, 5, 6, 7, 8, 9, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN};

    @Nullable
    public static String a(@NonNull String str, @NonNull String str2) {
        return b(str, str2);
    }

    @Nullable
    private static String b(@NonNull String str, @NonNull String str2) {
        try {
            return q.a(a(str.getBytes("UTF-8"), q.c(str2)));
        } catch (UnsupportedEncodingException e10) {
            a((ValueCallback<Exception>) null, e10);
            return null;
        }
    }

    public static String a(@NonNull String str, @NonNull String str2, @Nullable ValueCallback<Exception> valueCallback) {
        try {
            byte[] bArrB = b(str, str2, valueCallback);
            if (bArrB != null) {
                return new String(bArrB, "UTF-8");
            }
            return null;
        } catch (Exception e10) {
            a(valueCallback, e10);
            sg.bigo.ads.common.t.a.a(0, "SDKCipher", "Failed to decrypt data: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Nullable
    public static byte[] b(@NonNull String str, @NonNull String str2, @Nullable ValueCallback<Exception> valueCallback) {
        try {
            return a(q.c(str), q.c(str2), valueCallback);
        } catch (Exception e10) {
            a(valueCallback, e10);
            sg.bigo.ads.common.t.a.a(0, "SDKCipher", "Failed to decrypt data: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static void a(ValueCallback<Exception> valueCallback, Exception exc) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(exc);
        }
    }

    @Nullable
    public static byte[] b(byte[] bArr) {
        return a(bArr, f102820b, (ValueCallback<Exception>) null);
    }

    @Nullable
    public static byte[] a(byte[] bArr) {
        return a(bArr, f102820b);
    }

    @Nullable
    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f102819a);
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
                a((ValueCallback<Exception>) null, e10);
                if (e10 instanceof NoSuchAlgorithmException) {
                    sg.bigo.ads.common.t.a.a(0, "SDKCipher", "sdk cipher.encrypt failed, no such algorithm");
                    return bArr;
                }
                sg.bigo.ads.common.t.a.a(0, "SDKCipher", "sdk cipher.encrypt failed");
            }
        }
        return null;
    }

    @Nullable
    private static byte[] a(byte[] bArr, byte[] bArr2, ValueCallback<Exception> valueCallback) {
        if (bArr != null && bArr2 != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f102819a);
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
                a(valueCallback, e10);
                sg.bigo.ads.common.t.a.a(0, "SDKCipher", "sdk cipher.decrypt new key failed,input len:" + bArr.length + ",input data:" + Arrays.toString(bArr));
                if (e10 instanceof NoSuchAlgorithmException) {
                    return bArr;
                }
            }
        }
        return null;
    }
}
