package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements Hasher {
    AbstractHasher() {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putByte(byte b10) {
        return putByte(b10);
    }

    @Override // com.google.common.hash.Hasher
    @CanIgnoreReturnValue
    public <T> Hasher putObject(@ParametricNullness T t10, Funnel<? super T> funnel) {
        funnel.funnel(t10, this);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putBoolean(boolean z10) {
        return putByte(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putChar(char c10) {
        putByte((byte) c10);
        putByte((byte) (c10 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putDouble(double d10) {
        return putLong(Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putFloat(float f10) {
        return putInt(Float.floatToRawIntBits(f10));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putInt(int i10) {
        putByte((byte) i10);
        putByte((byte) (i10 >>> 8));
        putByte((byte) (i10 >>> 16));
        putByte((byte) (i10 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putLong(long j10) {
        for (int i10 = 0; i10 < 64; i10 += 8) {
            putByte((byte) (j10 >>> i10));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putShort(short s10) {
        putByte((byte) s10);
        putByte((byte) (s10 >>> 8));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putString(CharSequence charSequence, Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            putChar(charSequence.charAt(i10));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr) {
        return putBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr, int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            putByte(bArr[i10 + i12]);
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            putBytes(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            Java8Compatibility.d(byteBuffer, byteBuffer.limit());
            return this;
        }
        for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
            putByte(byteBuffer.get());
        }
        return this;
    }
}
