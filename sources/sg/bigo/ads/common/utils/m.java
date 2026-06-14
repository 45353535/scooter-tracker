package sg.bigo.ads.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class m {
    public static String a(String str) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append(random.nextInt(99999999));
        sb2.append(random.nextInt(99999999));
        while (sb2.length() < 16) {
            sb2.append('0');
        }
        if (sb2.length() > 16) {
            sb2.delete(16, sb2.length());
        }
        String strB = b(str + ((Object) sb2));
        if (q.a((CharSequence) strB)) {
            sg.bigo.ads.common.t.a.a(0, "MD5", "md5WithSalt is empty!");
            return strB;
        }
        char[] cArr = new char[48];
        for (int i10 = 0; i10 < 48; i10++) {
            int i11 = i10 / 3;
            int i12 = i10 % 3;
            if (i12 == 0) {
                cArr[i10] = strB.charAt(i11 * 2);
            } else if (i12 != 1) {
                cArr[i10] = strB.charAt((i11 * 2) + 1);
            } else {
                cArr[i10] = sb2.charAt(i11);
            }
        }
        String str2 = new String(cArr);
        sg.bigo.ads.common.t.a.a(0, 3, "MD5", "getMD5MixSalt, val=" + str + ", salt=" + ((Object) sb2) + ", md5WithSalt=" + strB + ", md5MixSalt=" + str2);
        return str2;
    }

    private static String b(String str) {
        byte[] bArrDigest;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            bArrDigest = messageDigest.digest();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            bArrDigest = null;
        }
        if (bArrDigest == null || bArrDigest.length <= 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArrDigest) {
            int i10 = b10 & 255;
            if (i10 <= 15) {
                sb2.append(0);
            }
            sb2.append(Integer.toHexString(i10));
        }
        return sb2.toString().toLowerCase();
    }
}
