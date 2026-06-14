package com.bykv.vk.openvk.qdl.qdl.qdl.wd;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static final MessageDigest qdl = qdl();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final char[] f15914ud = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private ud() {
    }

    private static MessageDigest qdl() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String qdl(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = qdl;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (ud.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return qdl(bArrDigest);
    }

    public static String qdl(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f15914ud;
            cArr[i10] = cArr2[(b10 & 240) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }
}
