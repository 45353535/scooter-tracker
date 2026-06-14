package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends Escaper {
    protected UnicodeEscaper() {
    }

    protected static int a(CharSequence charSequence, int i10, int i11) {
        Preconditions.checkNotNull(charSequence);
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i12 = i10 + 1;
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + i10 + " in '" + ((Object) charSequence) + "'");
        }
        if (i12 == i11) {
            return -cCharAt;
        }
        char cCharAt2 = charSequence.charAt(i12);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i12 + " in '" + ((Object) charSequence) + "'");
    }

    private static char[] d(char[] cArr, int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i11];
        if (i10 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i10);
        }
        return cArr2;
    }

    protected abstract char[] b(int i10);

    protected final String c(String str, int i10) {
        int length = str.length();
        char[] cArrA = Platform.a();
        int i11 = 0;
        int length2 = 0;
        while (i10 < length) {
            int iA = a(str, i10, length);
            if (iA < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrB = b(iA);
            int i12 = (Character.isSupplementaryCodePoint(iA) ? 2 : 1) + i10;
            if (cArrB != null) {
                int i13 = i10 - i11;
                int i14 = length2 + i13;
                int length3 = cArrB.length + i14;
                if (cArrA.length < length3) {
                    cArrA = d(cArrA, length2, length3 + (length - i10) + 32);
                }
                if (i13 > 0) {
                    str.getChars(i11, i10, cArrA, length2);
                    length2 = i14;
                }
                if (cArrB.length > 0) {
                    System.arraycopy(cArrB, 0, cArrA, length2, cArrB.length);
                    length2 += cArrB.length;
                }
                i11 = i12;
            }
            i10 = e(str, i12, length);
        }
        int i15 = length - i11;
        if (i15 > 0) {
            int i16 = i15 + length2;
            if (cArrA.length < i16) {
                cArrA = d(cArrA, length2, i16);
            }
            str.getChars(i11, length, cArrA, length2);
            length2 = i16;
        }
        return new String(cArrA, 0, length2);
    }

    protected int e(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            int iA = a(charSequence, i10, i11);
            if (iA < 0 || b(iA) != null) {
                break;
            }
            i10 += Character.isSupplementaryCodePoint(iA) ? 2 : 1;
        }
        return i10;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        int iE = e(str, 0, length);
        return iE == length ? str : c(str, iE);
    }
}
