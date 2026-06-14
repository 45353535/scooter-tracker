package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class PercentEscaper extends UnicodeEscaper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f31060d = {'+'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f31061e = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f31063c;

    public PercentEscaper(String str, boolean z10) {
        Preconditions.checkNotNull(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String str2 = str + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (z10 && str2.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f31062b = z10;
        this.f31063c = f(str2);
    }

    private static boolean[] f(String str) {
        char[] charArray = str.toCharArray();
        int iMax = -1;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected char[] b(int i10) {
        boolean[] zArr = this.f31063c;
        if (i10 < zArr.length && zArr[i10]) {
            return null;
        }
        if (i10 == 32 && this.f31062b) {
            return f31060d;
        }
        if (i10 <= 127) {
            char[] cArr = f31061e;
            return new char[]{'%', cArr[i10 >>> 4], cArr[i10 & 15]};
        }
        if (i10 <= 2047) {
            char[] cArr2 = f31061e;
            return new char[]{'%', cArr2[(i10 >>> 10) | 12], cArr2[(i10 >>> 6) & 15], '%', cArr2[((i10 >>> 4) & 3) | 8], cArr2[i10 & 15]};
        }
        if (i10 <= 65535) {
            char[] cArr3 = f31061e;
            return new char[]{'%', 'E', cArr3[i10 >>> 12], '%', cArr3[((i10 >>> 10) & 3) | 8], cArr3[(i10 >>> 6) & 15], '%', cArr3[((i10 >>> 4) & 3) | 8], cArr3[i10 & 15]};
        }
        if (i10 <= 1114111) {
            char[] cArr4 = f31061e;
            return new char[]{'%', 'F', cArr4[(i10 >>> 18) & 7], '%', cArr4[((i10 >>> 16) & 3) | 8], cArr4[(i10 >>> 12) & 15], '%', cArr4[((i10 >>> 10) & 3) | 8], cArr4[(i10 >>> 6) & 15], '%', cArr4[((i10 >>> 4) & 3) | 8], cArr4[i10 & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i10);
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected int e(CharSequence charSequence, int i10, int i11) {
        Preconditions.checkNotNull(charSequence);
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            boolean[] zArr = this.f31063c;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            boolean[] zArr = this.f31063c;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return c(str, i10);
            }
        }
        return str;
    }
}
