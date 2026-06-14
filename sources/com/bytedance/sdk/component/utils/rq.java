package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    private static final byte[] qdl = qdl("VP8X");

    private static byte[] qdl(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean qdl(byte[] bArr, int i10) {
        try {
            boolean zQdl = qdl(bArr, i10 + 12, qdl);
            int i11 = i10 + 20;
            if (bArr.length <= i11) {
                return false;
            }
            boolean z10 = (bArr[i11] & 2) == 2;
            if (zQdl && z10) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean qdl(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
