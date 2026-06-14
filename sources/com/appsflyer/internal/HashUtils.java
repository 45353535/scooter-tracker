package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class HashUtils {
    private static String bytesToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(Integer.toString((b10 & 255) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    @Nullable
    public static String hmacSha256(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            return bytesToHex(mac.doFinal(str.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, true);
            return e10.getMessage();
        }
    }
}
