package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class L7 {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{91, 78, 76, 6, 52, 3, 3, Ascii.RS, 3, 81, Ascii.DC2, Ascii.GS, Ascii.RS, 2, Ascii.CAN, Ascii.US, Ascii.SYN, 81, 3, Ascii.DC4, 2, Ascii.RS, 4, 3, Ascii.DC2, Ascii.DC4, 107, 98, 19};
    }

    static {
        A04();
        A01 = L7.class.getSimpleName();
    }

    public static String A01(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String extension = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(extension)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(extension);
    }

    public static String A02(String str) {
        try {
            return A03(MessageDigest.getInstance(A00(26, 3, 55)).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static String A03(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format(Locale.US, A00(0, 4, 111), Byte.valueOf(b10)));
        }
        return stringBuffer.toString();
    }

    public static void A05(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e(A01, A00(4, 22, 96), e10);
            }
        }
    }
}
