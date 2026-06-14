package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    private enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Byte.compare(bArr[i10], bArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    public static byte checkedCast(long j10) {
        byte b10 = (byte) j10;
        Preconditions.checkArgument(((long) b10) == j10, "Out of range: %s", j10);
        return b10;
    }

    public static int compare(byte b10, byte b11) {
        return Byte.compare(b10, b11);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 5);
        sb2.append((int) bArr[0]);
        for (int i10 = 1; i10 < bArr.length; i10++) {
            sb2.append(str);
            sb2.append((int) bArr[i10]);
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b10 = bArr[0];
        for (int i10 = 1; i10 < bArr.length; i10++) {
            byte b11 = bArr[i10];
            if (b11 > b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b10 = bArr[0];
        for (int i10 = 1; i10 < bArr.length; i10++) {
            byte b11 = bArr[i10];
            if (b11 < b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static byte saturatedCast(long j10) {
        return j10 > 127 ? Ascii.DEL : j10 < -128 ? UnsignedBytes.MAX_POWER_OF_TWO : (byte) j10;
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr, int i10, int i11) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i10, i11, bArr.length);
        Arrays.sort(bArr, i10, i11);
        Bytes.reverse(bArr, i10, i11);
    }
}
