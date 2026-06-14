package com.bykv.vk.openvk.qdl.qdl.qdl.wd;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static String qdl(File file) {
        return qdl(file, null);
    }

    public static String qdl(File file, String str) {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i10 = bufferedInputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            if (!TextUtils.isEmpty(str)) {
                messageDigest.update(str.getBytes());
            }
            bufferedInputStream.close();
            return qdl(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    private static String qdl(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[bArr.length * 2];
            int i10 = 0;
            for (byte b10 : bArr) {
                int i11 = i10 + 1;
                cArr2[i10] = cArr[(b10 >>> 4) & 15];
                i10 += 2;
                cArr2[i11] = cArr[b10 & Ascii.SI];
            }
            return new String(cArr2);
        }
        return "";
    }
}
