package com.mbridge.msdk.foundation.tools;

import android.util.Base64;
import androidx.annotation.RequiresApi;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f48942a = new byte[32];

    static {
        a(k0.a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN=="));
    }

    private static void a(String str) {
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-384").digest(str.getBytes()), 0, f48942a, 0, 32);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @RequiresApi(api = 19)
    public static String a(String str, byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }
}
