package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends Escaper {
    protected CharEscaper() {
    }

    private static char[] c(char[] cArr, int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i11];
        if (i10 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i10);
        }
        return cArr2;
    }

    protected abstract char[] a(char c10);

    protected final String b(String str, int i10) {
        int length = str.length();
        char[] cArrA = Platform.a();
        int length2 = cArrA.length;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            char[] cArrA2 = a(str.charAt(i10));
            if (cArrA2 != null) {
                int length3 = cArrA2.length;
                int i13 = i10 - i11;
                int i14 = i12 + i13;
                int i15 = i14 + length3;
                if (length2 < i15) {
                    length2 = ((length - i10) * 2) + i15;
                    cArrA = c(cArrA, i12, length2);
                }
                if (i13 > 0) {
                    str.getChars(i11, i10, cArrA, i12);
                    i12 = i14;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrA2, 0, cArrA, i12, length3);
                    i12 += length3;
                }
                i11 = i10 + 1;
            }
            i10++;
        }
        int i16 = length - i11;
        if (i16 > 0) {
            int i17 = i16 + i12;
            if (length2 < i17) {
                cArrA = c(cArrA, i12, i17);
            }
            str.getChars(i11, length, cArrA, i12);
            i12 = i17;
        }
        return new String(cArrA, 0, i12);
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (a(str.charAt(i10)) != null) {
                return b(str, i10);
            }
        }
        return str;
    }
}
