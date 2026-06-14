package com.google.common.hash;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public abstract class HashCode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f30757b = "0123456789abcdef".toCharArray();

    private static final class BytesHashCode extends HashCode implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f30758c;

        BytesHashCode(byte[] bArr) {
            this.f30758c = (byte[]) Preconditions.checkNotNull(bArr);
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return (byte[]) this.f30758c.clone();
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            byte[] bArr = this.f30758c;
            Preconditions.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f30758c;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            byte[] bArr = this.f30758c;
            Preconditions.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // com.google.common.hash.HashCode
        boolean b(HashCode hashCode) {
            if (this.f30758c.length != hashCode.d().length) {
                return false;
            }
            boolean z10 = true;
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f30758c;
                if (i10 >= bArr.length) {
                    return z10;
                }
                z10 &= bArr[i10] == hashCode.d()[i10];
                i10++;
            }
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return this.f30758c.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        byte[] d() {
            return this.f30758c;
        }

        @Override // com.google.common.hash.HashCode
        void g(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f30758c, 0, bArr, i10, i11);
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            long j10 = this.f30758c[0] & 255;
            for (int i10 = 1; i10 < Math.min(this.f30758c.length, 8); i10++) {
                j10 |= (((long) this.f30758c[i10]) & 255) << (i10 * 8);
            }
            return j10;
        }
    }

    private static final class IntHashCode extends HashCode implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f30759c;

        IntHashCode(int i10) {
            this.f30759c = i10;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            int i10 = this.f30759c;
            return new byte[]{(byte) i10, (byte) (i10 >> 8), (byte) (i10 >> 16), (byte) (i10 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return this.f30759c;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        boolean b(HashCode hashCode) {
            return this.f30759c == hashCode.asInt();
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        void g(byte[] bArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i10 + i12] = (byte) (this.f30759c >> (i12 * 8));
            }
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return UnsignedInts.toLong(this.f30759c);
        }
    }

    private static final class LongHashCode extends HashCode implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f30760c;

        LongHashCode(long j10) {
            this.f30760c = j10;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return new byte[]{(byte) this.f30760c, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return (int) this.f30760c;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            return this.f30760c;
        }

        @Override // com.google.common.hash.HashCode
        boolean b(HashCode hashCode) {
            return this.f30760c == hashCode.asLong();
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        void g(byte[] bArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i10 + i12] = (byte) (this.f30760c >> (i12 * 8));
            }
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return this.f30760c;
        }
    }

    HashCode() {
    }

    private static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c10);
    }

    static HashCode c(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode fromBytes(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return c((byte[]) bArr.clone());
    }

    public static HashCode fromInt(int i10) {
        return new IntHashCode(i10);
    }

    public static HashCode fromLong(long j10) {
        return new LongHashCode(j10);
    }

    public static HashCode fromString(String str) {
        Preconditions.checkArgument(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        Preconditions.checkArgument(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < str.length(); i10 += 2) {
            bArr[i10 / 2] = (byte) ((a(str.charAt(i10)) << 4) + a(str.charAt(i10 + 1)));
        }
        return c(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    abstract boolean b(HashCode hashCode);

    public abstract int bits();

    byte[] d() {
        return asBytes();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HashCode) {
            HashCode hashCode = (HashCode) obj;
            if (bits() == hashCode.bits() && b(hashCode)) {
                return true;
            }
        }
        return false;
    }

    abstract void g(byte[] bArr, int i10, int i11);

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bArrD = d();
        int i10 = bArrD[0] & 255;
        for (int i11 = 1; i11 < bArrD.length; i11++) {
            i10 |= (bArrD[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bArrD = d();
        StringBuilder sb2 = new StringBuilder(bArrD.length * 2);
        for (byte b10 : bArrD) {
            char[] cArr = f30757b;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & Ascii.SI]);
        }
        return sb2.toString();
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i10, int i11) {
        int iMin = Ints.min(i11, bits() / 8);
        Preconditions.checkPositionIndexes(i10, i10 + iMin, bArr.length);
        g(bArr, i10, iMin);
        return iMin;
    }
}
