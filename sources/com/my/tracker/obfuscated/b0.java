package com.my.tracker.obfuscated;

import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b0 {
    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02X", Byte.valueOf(b10)));
            }
            return sb2.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return null;
        }
    }
}
