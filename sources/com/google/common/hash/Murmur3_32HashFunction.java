package com.google.common.hash;

import androidx.collection.ScatterMapKt;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final HashFunction f30800d = new Murmur3_32HashFunction(0, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final HashFunction f30801e = new Murmur3_32HashFunction(0, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final HashFunction f30802f = new Murmur3_32HashFunction(Hashing.f30761a, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30804c;

    private static final class Murmur3_32Hasher extends AbstractHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f30806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f30807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f30808d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f30809e = false;

        Murmur3_32Hasher(int i10) {
            this.f30805a = i10;
        }

        private void a(int i10, long j10) {
            long j11 = this.f30806b;
            int i11 = this.f30807c;
            long j12 = ((j10 & 4294967295L) << i11) | j11;
            this.f30806b = j12;
            int i12 = i11 + (i10 * 8);
            this.f30807c = i12;
            this.f30808d += i10;
            if (i12 >= 32) {
                this.f30805a = Murmur3_32HashFunction.o(this.f30805a, Murmur3_32HashFunction.q((int) j12));
                this.f30806b >>>= 32;
                this.f30807c -= 32;
            }
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            Preconditions.checkState(!this.f30809e);
            this.f30809e = true;
            int iQ = this.f30805a ^ Murmur3_32HashFunction.q((int) this.f30806b);
            this.f30805a = iQ;
            return Murmur3_32HashFunction.m(iQ, this.f30808d);
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putByte(byte b10) {
            a(1, b10 & 255);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putChar(char c10) {
            a(2, c10);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putInt(int i10) {
            a(4, i10);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putLong(long j10) {
            a(4, (int) j10);
            a(4, j10 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putString(CharSequence charSequence, Charset charset) {
            if (!StandardCharsets.UTF_8.equals(charset)) {
                return super.putString(charSequence, charset);
            }
            int length = charSequence.length();
            int i10 = 0;
            while (true) {
                int i11 = i10 + 4;
                if (i11 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i10);
                char cCharAt2 = charSequence.charAt(i10 + 1);
                char cCharAt3 = charSequence.charAt(i10 + 2);
                char cCharAt4 = charSequence.charAt(i10 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                a(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i10 = i11;
            }
            while (i10 < length) {
                char cCharAt5 = charSequence.charAt(i10);
                if (cCharAt5 < 128) {
                    a(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    a(2, Murmur3_32HashFunction.k(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    a(3, Murmur3_32HashFunction.j(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i10);
                    if (iCodePointAt == cCharAt5) {
                        putBytes(charSequence.subSequence(i10, length).toString().getBytes(charset));
                        return this;
                    }
                    i10++;
                    a(4, Murmur3_32HashFunction.l(iCodePointAt));
                }
                i10++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putBytes(byte[] bArr, int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (true) {
                int i13 = i12 + 4;
                if (i13 > i11) {
                    break;
                }
                a(4, Murmur3_32HashFunction.n(bArr, i12 + i10));
                i12 = i13;
            }
            while (i12 < i11) {
                putByte(bArr[i10 + i12]);
                i12++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putBytes(ByteBuffer byteBuffer) {
            ByteOrder byteOrderOrder = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                putInt(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                putByte(byteBuffer.get());
            }
            byteBuffer.order(byteOrderOrder);
            return this;
        }
    }

    Murmur3_32HashFunction(int i10, boolean z10) {
        this.f30803b = i10;
        this.f30804c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long j(char c10) {
        return ((long) (c10 >>> '\f')) | 224 | ((long) ((((c10 >>> 6) & 63) | 128) << 8)) | ((long) (((c10 & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long k(char c10) {
        return ((long) (c10 >>> 6)) | 192 | ((long) (((c10 & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long l(int i10) {
        return ((long) (i10 >>> 18)) | 240 | ((((long) ((i10 >>> 12) & 63)) | 128) << 8) | ((((long) ((i10 >>> 6) & 63)) | 128) << 16) | ((((long) (i10 & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode m(int i10, int i11) {
        int i12 = i10 ^ i11;
        int i13 = (i12 ^ (i12 >>> 16)) * (-2048144789);
        int i14 = (i13 ^ (i13 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i14 ^ (i14 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(byte[] bArr, int i10) {
        return Ints.fromBytes(bArr[i10 + 3], bArr[i10 + 2], bArr[i10 + 1], bArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i10, int i11) {
        return (Integer.rotateLeft(i10 ^ i11, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(int i10) {
        return Integer.rotateLeft(i10 * ScatterMapKt.MurmurHashC1, 15) * 461845907;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Murmur3_32HashFunction) {
            Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
            if (this.f30803b == murmur3_32HashFunction.f30803b && this.f30804c == murmur3_32HashFunction.f30804c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
        int iO = this.f30803b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i13 + 4;
            if (i14 > i11) {
                break;
            }
            iO = o(iO, q(n(bArr, i13 + i10)));
            i13 = i14;
        }
        int i15 = i13;
        int i16 = 0;
        while (i15 < i11) {
            i12 ^= UnsignedBytes.toInt(bArr[i10 + i15]) << i16;
            i15++;
            i16 += 8;
        }
        return m(q(i12) ^ iO, i11);
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.f30803b;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i10) {
        return m(o(this.f30803b, q(i10)), 4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j10) {
        return m(o(o(this.f30803b, q((int) j10)), q((int) (j10 >>> 32))), 8);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        if (!StandardCharsets.UTF_8.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int iO = this.f30803b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 4;
            if (i13 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i11);
            char cCharAt2 = charSequence.charAt(i11 + 1);
            char cCharAt3 = charSequence.charAt(i11 + 2);
            char cCharAt4 = charSequence.charAt(i11 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iO = o(iO, q((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i12 += 4;
            i11 = i13;
        }
        long j10 = 0;
        while (i11 < length) {
            char cCharAt5 = charSequence.charAt(i11);
            if (cCharAt5 < 128) {
                j10 |= ((long) cCharAt5) << i10;
                i10 += 8;
                i12++;
            } else if (cCharAt5 < 2048) {
                j10 |= k(cCharAt5) << i10;
                i10 += 16;
                i12 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                j10 |= j(cCharAt5) << i10;
                i10 += 24;
                i12 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i11);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i11++;
                j10 |= l(iCodePointAt) << i10;
                if (this.f30804c) {
                    i10 += 32;
                }
                i12 += 4;
            }
            if (i10 >= 32) {
                iO = o(iO, q((int) j10));
                j10 >>>= 32;
                i10 -= 32;
            }
            i11++;
        }
        return m(q((int) j10) ^ iO, i12);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int iQ = this.f30803b;
        for (int i10 = 1; i10 < charSequence.length(); i10 += 2) {
            iQ = o(iQ, q(charSequence.charAt(i10 - 1) | (charSequence.charAt(i10) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            iQ ^= q(charSequence.charAt(charSequence.length() - 1));
        }
        return m(iQ, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_32Hasher(this.f30803b);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.f30803b + ")";
    }
}
