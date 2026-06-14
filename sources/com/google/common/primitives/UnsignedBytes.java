package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;

    @VisibleForTesting
    static class LexicographicalComparatorHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f31134a = LexicographicalComparatorHolder.class.getName() + "$UnsafeComparator";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Comparator f31135b = a();

        enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i10 = 0; i10 < iMin; i10++) {
                    int iCompare = UnsignedBytes.compare(bArr[i10], bArr2[i10]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        @VisibleForTesting
        enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            static final boolean f31137b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            static final Unsafe f31138c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            static final int f31139d;

            static {
                Unsafe unsafeG = g();
                f31138c = unsafeG;
                int iArrayBaseOffset = unsafeG.arrayBaseOffset(byte[].class);
                f31139d = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafeG.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe g() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
                            @Override // java.security.PrivilegedExceptionAction
                            public Unsafe run() throws Exception {
                                for (Field field : Unsafe.class.getDeclaredFields()) {
                                    field.setAccessible(true);
                                    Object obj = field.get(null);
                                    if (Unsafe.class.isInstance(obj)) {
                                        return (Unsafe) Unsafe.class.cast(obj);
                                    }
                                }
                                throw new NoSuchFieldError("the Unsafe");
                            }
                        });
                    }
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i10 = iMin & (-8);
                int i11 = 0;
                while (i11 < i10) {
                    Unsafe unsafe = f31138c;
                    int i12 = f31139d;
                    long j10 = i11;
                    long j11 = unsafe.getLong(bArr, ((long) i12) + j10);
                    long j12 = unsafe.getLong(bArr2, ((long) i12) + j10);
                    if (j11 != j12) {
                        if (f31137b) {
                            return Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11 ^ j12) & (-8);
                        return ((int) ((j11 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j12 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i11 += 8;
                }
                while (i11 < iMin) {
                    int iCompare = UnsignedBytes.compare(bArr[i11], bArr2[i11]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i11++;
                }
                return bArr.length - bArr2.length;
            }
        }

        static Comparator a() {
            try {
                Object[] enumConstants = Class.forName(f31134a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.b();
            }
        }
    }

    private static byte a(byte b10) {
        return (byte) (b10 ^ MAX_POWER_OF_TWO);
    }

    static Comparator b() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    @CanIgnoreReturnValue
    public static byte checkedCast(long j10) {
        Preconditions.checkArgument((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int compare(byte b10, byte b11) {
        return toInt(b10) - toInt(b11);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * (str.length() + 3));
        sb2.append(toInt(bArr[0]));
        for (int i10 = 1; i10 < bArr.length; i10++) {
            sb2.append(str);
            sb2.append(toString(bArr[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.f31135b;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i10 = toInt(bArr[0]);
        for (int i11 = 1; i11 < bArr.length; i11++) {
            int i12 = toInt(bArr[i11]);
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return (byte) i10;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i10 = toInt(bArr[0]);
        for (int i11 = 1; i11 < bArr.length; i11++) {
            int i12 = toInt(bArr[i11]);
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return (byte) i10;
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static byte saturatedCast(long j10) {
        if (j10 > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (j10 < 0) {
            return (byte) 0;
        }
        return (byte) j10;
    }

    public static void sort(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static int toInt(byte b10) {
        return b10 & 255;
    }

    public static String toString(byte b10) {
        return toString(b10, 10);
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str, int i10) {
        int i11 = Integer.parseInt((String) Preconditions.checkNotNull(str), i10);
        if ((i11 >> 8) == 0) {
            return (byte) i11;
        }
        throw new NumberFormatException("out of range: " + i11);
    }

    public static String toString(byte b10, int i10) {
        Preconditions.checkArgument(i10 >= 2 && i10 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i10);
        return Integer.toString(toInt(b10), i10);
    }

    public static void sort(byte[] bArr, int i10, int i11) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i10, i11, bArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12] = a(bArr[i12]);
        }
        Arrays.sort(bArr, i10, i11);
        while (i10 < i11) {
            bArr[i10] = a(bArr[i10]);
            i10++;
        }
    }

    public static void sortDescending(byte[] bArr, int i10, int i11) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i10, i11, bArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ Ascii.DEL);
        }
        Arrays.sort(bArr, i10, i11);
        while (i10 < i11) {
            bArr[i10] = (byte) (bArr[i10] ^ Ascii.DEL);
            i10++;
        }
    }
}
