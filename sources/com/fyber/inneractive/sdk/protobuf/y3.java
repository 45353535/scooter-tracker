package com.fyber.inneractive.sdk.protobuf;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y3 {
    public static boolean a(byte b10) {
        return b10 >= 0;
    }

    public static boolean b(byte b10) {
        return b10 > -65;
    }

    public static void a(byte b10, byte b11, char[] cArr, int i10) throws n1 {
        if (b10 < -62 || b(b11)) {
            throw new n1("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b10 & Ascii.US) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static void a(byte b10, byte b11, byte b12, char[] cArr, int i10) throws n1 {
        if (!b(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !b(b12)))) {
            cArr[i10] = (char) (((b10 & Ascii.SI) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw new n1("Protocol message had invalid UTF-8.");
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws n1 {
        if (!b(b11)) {
            if ((((b11 + 112) + (b10 << Ascii.FS)) >> 30) == 0 && !b(b12) && !b(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (b13 & Utf8.REPLACEMENT_BYTE);
                cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i10 + 1] = (char) ((i11 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw new n1("Protocol message had invalid UTF-8.");
    }
}
