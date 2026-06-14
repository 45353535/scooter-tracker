package com.google.android.gms.internal.consent_sdk;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes8.dex */
final class zzde extends zzdd {
    zzde(char c10) {
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = 44;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
