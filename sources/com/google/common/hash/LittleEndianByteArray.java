package com.google.common.hash;

import com.google.common.hash.LittleEndianByteArray;
import com.google.common.primitives.Longs;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LittleEndianBytes f30771a;

    private enum JavaLittleEndianBytes implements LittleEndianBytes {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i10) {
                return Longs.fromBytes(bArr[i10 + 7], bArr[i10 + 6], bArr[i10 + 5], bArr[i10 + 4], bArr[i10 + 3], bArr[i10 + 2], bArr[i10 + 1], bArr[i10]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i10, long j10) {
                long j11 = 255;
                for (int i11 = 0; i11 < 8; i11++) {
                    bArr[i10 + i11] = (byte) ((j10 & j11) >> (i11 * 8));
                    j11 <<= 8;
                }
            }
        }
    }

    private interface LittleEndianBytes {
        long getLongLittleEndian(byte[] bArr, int i10);

        void putLongLittleEndian(byte[] bArr, int i10, long j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum UnsafeByteArray implements LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i10) {
                return UnsafeByteArray.f30773b.getLong(bArr, ((long) i10) + ((long) UnsafeByteArray.f30774c));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i10, long j10) {
                UnsafeByteArray.f30773b.putLong(bArr, ((long) i10) + ((long) UnsafeByteArray.f30774c), j10);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i10) {
                return Long.reverseBytes(UnsafeByteArray.f30773b.getLong(bArr, ((long) i10) + ((long) UnsafeByteArray.f30774c)));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i10, long j10) {
                UnsafeByteArray.f30773b.putLong(bArr, ((long) i10) + ((long) UnsafeByteArray.f30774c), Long.reverseBytes(j10));
            }
        };


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Unsafe f30773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f30774c;

        static {
            Unsafe unsafeJ = j();
            f30773b = unsafeJ;
            f30774c = unsafeJ.arrayBaseOffset(byte[].class);
            if (unsafeJ.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private static Unsafe j() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.common.hash.b
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return LittleEndianByteArray.UnsafeByteArray.k();
                        }
                    });
                }
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe k() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        LittleEndianBytes littleEndianBytes = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                littleEndianBytes = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f30771a = littleEndianBytes;
    }

    static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static long b(byte[] bArr, int i10) {
        return f30771a.getLongLittleEndian(bArr, i10);
    }

    static long c(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, 8);
        long j10 = 0;
        for (int i12 = 0; i12 < iMin; i12++) {
            j10 |= (((long) bArr[i10 + i12]) & 255) << (i12 * 8);
        }
        return j10;
    }
}
