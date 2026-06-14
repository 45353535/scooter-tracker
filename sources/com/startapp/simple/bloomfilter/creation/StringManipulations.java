package com.startapp.simple.bloomfilter.creation;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes11.dex */
class StringManipulations {
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    StringManipulations() {
    }

    private boolean encodedLenghtIsNotEven(String str) {
        return str.length() % 2 != 0;
    }

    String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            char[] cArr2 = HEX_CHARS;
            byte b10 = bArr[i10];
            cArr[i11] = cArr2[(b10 & 240) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    byte[] hexToByte(String str) {
        if (encodedLenghtIsNotEven(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }
}
