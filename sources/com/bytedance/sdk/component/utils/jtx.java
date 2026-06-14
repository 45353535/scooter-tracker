package com.bytedance.sdk.component.utils;

import com.google.common.base.Ascii;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public class jtx {
    private static final char[] qdl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String qdl(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return qdl(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String qdl(byte[] bArr) {
        if (bArr != null) {
            return qdl(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String qdl(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if (i10 >= 0 && i10 + i11 <= bArr.length) {
                int i12 = i11 * 2;
                char[] cArr = new char[i12];
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    byte b10 = bArr[i14 + i10];
                    int i15 = i13 + 1;
                    char[] cArr2 = qdl;
                    cArr[i13] = cArr2[(b10 & 255) >> 4];
                    i13 += 2;
                    cArr[i15] = cArr2[b10 & Ascii.SI];
                }
                return new String(cArr, 0, i12);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
