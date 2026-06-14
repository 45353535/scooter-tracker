package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f48941b = new byte[32];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f48940a = new byte[16];

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.a$a, reason: collision with other inner class name */
    public static class C0522a extends Provider {
        public C0522a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
        }
    }

    static {
        a(k0.a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN=="));
    }

    private static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("sha-384").digest(str.getBytes());
            System.arraycopy(bArrDigest, 0, f48941b, 0, 32);
            System.arraycopy(bArrDigest, 32, f48940a, 0, 16);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String b(String str) {
        return a(str, f48941b, f48940a);
    }

    public static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C0522a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
