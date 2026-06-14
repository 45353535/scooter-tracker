package com.google.android.gms.internal.common;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes8.dex */
final class zzm extends zzl {
    private final char zza;

    zzm(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = this.zza;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(strCopyValueOf);
        sb2.append("')");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
